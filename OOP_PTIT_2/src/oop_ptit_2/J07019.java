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
import java.math.*;
class SanPham19{
    private String maSP, tenSP;
    private long dongia1, dongia2;

    public SanPham19(String maSP, String tenSP, long dongia1, long dongia2) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.dongia1 = dongia1;
        this.dongia2 = dongia2;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public long getDongia1() {
        return dongia1;
    }

    public long getDongia2() {
        return dongia2;
    }
    
}
class HoaDon19{
    private String maHD;
    private long sl,dongia,thanhtien,giamgia, phaitra;
    private SanPham19 a;
    
    public HoaDon19(String ma, long sl, SanPham19 a){
        this.a = a;
        this.maHD = ma;
        if(ma.charAt(2)=='1')this.dongia = a.getDongia1();
        else this.dongia = a.getDongia2();
        this.thanhtien = sl*this.dongia;
        if(sl>=150)this.giamgia = Math.round(this.thanhtien*50/100.0);
        else if(sl>=100)this.giamgia = Math.round(this.thanhtien*30/100.0);
        else if(sl>=50)this.giamgia = Math.round(this.thanhtien*15/100.0);
        else this.giamgia = 0;
        this.phaitra = this.thanhtien-this.giamgia;
    }

    @Override
    public String toString() {
        return maHD + " " + a.getTenSP() + " " + giamgia + " " + phaitra;
    }
    
}
public class J07019 {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String,SanPham19> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            long dg1 = Long.parseLong(sc.nextLine().trim());
            long dg2 = Long.parseLong(sc.nextLine().trim());
            mp.put(ma, new SanPham19(ma,ten,dg1,dg2));
        }
        sc.close();
        sc = new Scanner(new File("DATA2.in"));
        ArrayList<HoaDon19> arr = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<m;i++){
            String ma = sc.next().trim();
            long sl = Long.parseLong(sc.next().trim());
            arr.add(new HoaDon19(ma+String.format("-%03d", i+1),sl,mp.get(ma.substring(0, 2))));
        }
        for(HoaDon19 x:arr){
            System.out.println(x);
        }
    }
}
