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
class HocSinh54{
    private String maHocSinh, tenHocSinh;
    private float dtb;
    private int stt;

    public HocSinh54(String maHocSinh, String tenHocSinh, float dtb) {
        this.maHocSinh = maHocSinh;
        this.tenHocSinh = tenHocSinh;
        this.dtb = dtb;
    }

    @Override
    public String toString() {
        String tmp = "";
        if(dtb>=9)tmp = "Gioi";
        else if(dtb>=7)tmp = "Kha";
        else if(dtb>=5)tmp = "Trung Binh";
        else tmp = "Yeu";
        return maHocSinh + " " + tenHocSinh + " " + dtb + " " + tmp;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getStt() {
        return stt;
    }

    public float getDtb() {
        return dtb;
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }
    
}
public class J05054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HocSinh54> arr1 = new ArrayList<>();
        ArrayList<HocSinh54> arr2 = new ArrayList<>();
        Map<String,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String mhs = String.format("HS%02d", i+1);
            String ten = sc.nextLine();
            float dtb = sc.nextFloat();
            arr1.add(new HocSinh54(mhs,ten,dtb));
            arr2.add(new HocSinh54(mhs,ten,dtb));
        }
        arr2.sort((h1,h2)->Float.compare(h2.getDtb(), h1.getDtb()));
        arr2.get(0).setStt(1);
        mp.put(arr2.get(0).getMaHocSinh(), arr2.get(0).getStt());
        for(int i=1;i<arr2.size();i++){
            if(arr2.get(i).getDtb()==arr2.get(i-1).getDtb()){
                arr2.get(i).setStt(arr2.get(i-1).getStt());
            }
            else arr2.get(i).setStt(i+1);
            mp.put(arr2.get(i).getMaHocSinh(), arr2.get(i).getStt());
        }
        for(HocSinh54 x:arr1){
            System.out.println(x+" "+mp.get(x.getMaHocSinh()));
        }
    }
}
