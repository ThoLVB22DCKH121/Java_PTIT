/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.io.*;

class SanPham implements Comparable<SanPham>{
    private String maSanPham, tenSanPham;
    private int giaBan, thoihanBaoHanh;
    public void setmaSanPham(String maSanPham){
        this.maSanPham = maSanPham;
    }
    public String getmaSanPham(){
        return maSanPham;
    }
    public void settenSanPham(String tenSanPham){
        this.tenSanPham = tenSanPham;
    }
    public String gettenSanPham(){
        return tenSanPham;
    }
    public void setgiaBan(int giaBan){
        this.giaBan = giaBan;
    }
    public int getgiaBan(){
        return giaBan;
    }
    public void setthoihanBaoHanh(int thoihanBaoHanh){
        this.thoihanBaoHanh = thoihanBaoHanh;
    }
    public int getthoihanBaoHanh(){
        return thoihanBaoHanh;
    }
    public SanPham(String maSanPham, String tenSanPham, int giaBan, int thoihanBaoHanh){
        this.giaBan = giaBan;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.thoihanBaoHanh = thoihanBaoHanh;
    }
    public int compareTo(SanPham a) {
        if (this.giaBan != a.getgiaBan()) {
            return Integer.compare(a.giaBan, this.getgiaBan());
        } else {
            return this.maSanPham.compareTo(a.getmaSanPham());
        }
    }
    public String toString(){
        return maSanPham + " " + tenSanPham + " " + giaBan + " " + thoihanBaoHanh;
    }
}

public class J07048 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String masp = sc.nextLine().trim();
            String tensp = sc.nextLine().trim();
            int giaban = Integer.parseInt(sc.nextLine().trim());
            int thoihan = Integer.parseInt(sc.nextLine().trim());
            a.add(new SanPham(masp,tensp,giaban,thoihan));
        }
        Collections.sort(a);
        for(SanPham x:a){
            System.out.println(x);
        }
    }
}
