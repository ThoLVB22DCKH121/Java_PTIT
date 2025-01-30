/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit_2;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.text.*;
import java.time.*;
class VDV implements Comparable<VDV>{
    private String maVDV, tenVDV, thucTe, uuTien, hienTai;
    private int stt;

    public VDV(String maVDV, String tenVDV, String thucTe, String uuTien, String hienTai) {
        this.maVDV = maVDV;
        this.tenVDV = tenVDV;
        this.thucTe = thucTe;
        this.hienTai = hienTai;
        this.uuTien = uuTien;
    }

    @Override
    public String toString() {
        return maVDV + " " + tenVDV + " " + thucTe + " " + uuTien + " " + hienTai;
    }

    public String getHienTai() {
        return hienTai;
    }
    
    public int compareTo(VDV other){
        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
        try {
            return f.parse(this.hienTai).compareTo(f.parse(other.hienTai));
        } catch (ParseException ex) {
            
        }
        return 0;
    }

    public String getMaVDV() {
        return maVDV;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
}
public class J05055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<VDV> arr1 = new ArrayList<>();
        ArrayList<VDV> arr2 = new ArrayList<>();
        Map<String,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            String ma = String.format("VDV%02d", i+1);
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            String gxp = sc.nextLine();
            String gdd = sc.nextLine();
            String ut = "";
            int tmp = 2021-Integer.parseInt(ns.substring(6));
            if(tmp<18)ut = "00:00:00";
            else if(tmp<25)ut = "00:00:01";
            else if(tmp<=32)ut = "00:00:02";
            else ut = "00:00:03";
            SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
            try{
                arr1.add(new VDV(ma,ten,f.format(f.parse(gdd).getTime()-f.parse(gxp).getTime()+ f.parse("00:00:00").getTime()),ut,f.format(f.parse(gdd).getTime()-f.parse(gxp).getTime()-f.parse(ut).getTime()- f.parse("00:00:00").getTime())));
                arr2.add(new VDV(ma,ten,f.format(f.parse(gdd).getTime()-f.parse(gxp).getTime()+ f.parse("00:00:00").getTime()),ut,f.format(f.parse(gdd).getTime()-f.parse(gxp).getTime()-f.parse(ut).getTime()- f.parse("00:00:00").getTime())));
            }
            catch(ParseException e){
                
            }
        }
        Collections.sort(arr2);
        arr2.get(0).setStt(1);
        mp.put(arr2.get(0).getMaVDV(), 1);
        for(int i=1;i<arr2.size();i++){
            if(arr2.get(i).getHienTai().equals(arr2.get(i-1).getHienTai())){
                arr2.get(i).setStt(arr2.get(i-1).getStt());
            }
            else arr2.get(i).setStt(i+1);
            mp.put(arr2.get(i).getMaVDV(), arr2.get(i).getStt());
        }
        for(VDV x:arr2){
            System.out.println(x+" "+mp.get(x.getMaVDV()));
        }
    }
}
