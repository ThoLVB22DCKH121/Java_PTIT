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
class DonHang implements Comparable<DonHang>{
    private String tenHamg, maDonHang, sttDonHang;
    private long giamGia, thanhTien;

    public DonHang(String tenHamg, String maDonHang, String sttDonHang, long giamGia, long thanhTien) {
        this.tenHamg = tenHamg;
        this.maDonHang = maDonHang;
        this.sttDonHang = sttDonHang;
        this.giamGia = giamGia;
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return tenHamg + " " + maDonHang + " " + sttDonHang + " " + giamGia + " " + thanhTien;
    }
    
    public int compareTo(DonHang other){
        return Integer.compare(Integer.parseInt(this.sttDonHang), Integer.parseInt(other.sttDonHang));
    }
}
public class J05053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DonHang> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            long dongia = sc.nextLong();
            long soluong = sc.nextLong();
            long giamgia = 0;
            if(ma.charAt(ma.length()-1)=='1')giamgia = dongia*soluong*50/100;
            else giamgia = dongia*soluong*30/100;
            arr.add(new DonHang(ten,ma,ma.substring(1,4),giamgia,dongia*soluong-giamgia));
        }
        Collections.sort(arr);
        for(DonHang x:arr){
            System.out.println(x);
        }
    }
}
