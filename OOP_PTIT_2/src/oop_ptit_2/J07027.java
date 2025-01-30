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
class SinhVien27{
    private String maSV, tenSV, sdt;

    public SinhVien27(String maSV, String tenSV, String sdt) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdt = sdt;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getSdt() {
        return sdt;
    }
    
}
class BaiTap27{
    private String tenBT;

    public BaiTap27(String tenBT) {
        this.tenBT = tenBT;
    }

    public String getTenBT() {
        return tenBT;
    }
}
class Nhom27 implements Comparable<Nhom27>{
    private SinhVien27 a;
    private BaiTap27 b;
    private String stt;

    public Nhom27(SinhVien27 a, BaiTap27 b, String stt) {
        this.a = a;
        this.b = b;
        this.stt = stt;
    }

    @Override
    public String toString() {
        return a.getMaSV() + " " + a.getTenSV() + " " + a.getSdt() + " " + stt +" "+b.getTenBT() ;
    }
    public int compareTo(Nhom27 other){
        return this.a.getMaSV().compareTo(other.a.getMaSV());
    }
}
public class J07027 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String,SinhVien27> mp1 = new HashMap<>();
        for(int i=0;i<n;i++){
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String sdt = sc.nextLine().trim();
            mp1.put(ma, new SinhVien27(ma,ten,sdt));
        }
        sc.close();
        sc = new Scanner(new File("BAITAP.in"));
        int m = Integer.parseInt(sc.nextLine().trim());
        Map<String,BaiTap27> mp2 = new HashMap<>();
        for(int i=0;i<m;i++){
            String ten = sc.nextLine().trim();
            mp2.put(Integer.toString(i+1), new BaiTap27(ten));
        }
        sc.close();
        sc = new Scanner(new File("NHOM.in"));
        ArrayList<Nhom27> arr = new ArrayList<>();
        while(sc.hasNext()){
            String msv = sc.next().trim();
            String mabt = sc.next().trim();
            arr.add(new Nhom27(mp1.get(msv),mp2.get(mabt),mabt));
        }
        Collections.sort(arr);
        for(Nhom27 x:arr){
            System.out.println(x);
        }
    }
}
