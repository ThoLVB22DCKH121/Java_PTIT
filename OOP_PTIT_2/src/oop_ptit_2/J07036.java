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
import java.io.*;
class MonHoc36{
    private String maM, tenM, stc;

    public MonHoc36(String maM, String tenM, String stc) {
        this.maM = maM;
        this.tenM = tenM;
        this.stc = stc;
    }

    public String getMaM() {
        return maM;
    }

    public String getTenM() {
        return tenM;
    }

    public String getStc() {
        return stc;
    }
    
}
class SinhVien36{
    private String maSV, tenSV, lopSV, emailSV;

    public SinhVien36(String maSV, String tenSV, String lopSV, String emailSV) {
        this.maSV = maSV;
        this.tenSV = chuanhoaten(tenSV);
        this.lopSV = lopSV;
        this.emailSV = emailSV;
    }
    
    public String chuanhoaten(String s){
        String[] line = s.split("\\s+");
        String tmp = "";
        for(String x:line){
            tmp += x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return tmp.trim();
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getLopSV() {
        return lopSV;
    }

    public String getEmailSV() {
        return emailSV;
    }
    
}
class BangDiem36 implements Comparable<BangDiem36>{
    private SinhVien36 a;
    private MonHoc36 b;
    private double dtb;

    public BangDiem36(SinhVien36 a, MonHoc36 b, double dtb) {
        this.a = a;
        this.b = b;
        this.dtb = dtb;
    }
    
    public String chuanhoadiem(double d){
        if(d%1==0)return Long.toString((long)d);
        else return Double.toString(d);
    }
    @Override
    public String toString() {
        return a.getMaSV() + " " + a.getTenSV() + " " + b.getMaM() + " " + b.getTenM() + " " + chuanhoadiem(dtb);
    }
    public int compareTo(BangDiem36 other){
        if(this.b.getMaM().equals(other.b.getMaM())){
            return this.a.getMaSV().compareTo(other.a.getMaSV());
        }
        else return this.b.getMaM().compareTo(other.b.getMaM());
    }

    public SinhVien36 getA() {
        return a;
    }
}
public class J07036 {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String,SinhVien36> mp1 = new HashMap<>();
        Map<String,SinhVien36> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            mp1.put(ma, new SinhVien36(ma,ten,lop,email));
            mp.put(lop, new SinhVien36(ma,ten,lop,email));
        }
        sc.close();
        sc = new Scanner(new File("MONHOC.in"));
        int m = Integer.parseInt(sc.nextLine().trim());
        Map<String,MonHoc36> mp2 = new HashMap<>();
        for(int i=0;i<m;i++){
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String stc = sc.nextLine().trim();
            mp2.put(ma, new MonHoc36(ma,ten,stc));
        }
        sc.close();
        sc = new Scanner(new File("BANGDIEM.in"));
        int k = Integer.parseInt(sc.nextLine().trim());
        ArrayList<BangDiem36> arr = new ArrayList<>();
        for(int i=0;i<k;i++){
            String[] line = sc.nextLine().trim().split("\\s+");
            arr.add(new BangDiem36(mp1.get(line[0]),mp2.get(line[1]),Double.parseDouble(line[2])));
        }
        Collections.sort(arr);
        int q = Integer.parseInt(sc.nextLine().trim());
        while(q-->0){
            String ma = sc.nextLine().trim();
            System.out.println("BANG DIEM lop "+mp.get(ma).getLopSV()+":");
            for(BangDiem36 x:arr){
                if(x.getA().getLopSV().equals(ma)){
                    System.out.println(x);
                }
            }
        }
    }
}
