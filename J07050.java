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

class MatHang{
    private String maMatHang, tenMatHang, nhomMatHang;
    private double giaBan, giaMua;
    public void setMaMatHang(String maMatHang){
        this.maMatHang = maMatHang;
    }
    public String getMaMatHang(){
        return maMatHang;
    }
    public void setTenMatHang(String tenMatHang){
        this.tenMatHang = tenMatHang;
    }
    public String getTenMatHang(){
        return tenMatHang;
    }
    public void setNhomMatHang(String nhomMatHang){
        this.nhomMatHang = nhomMatHang;
    }
    public String getNhomMatHang(){
        return nhomMatHang;
    }
    public void setGiaBan(long giaBan){
        this.giaBan = giaBan;
    }
    public double getGiaBan(){
        return giaBan;
    }
    public void setGiaMua(long giaMua){
        this.giaMua = giaMua;
    }
    public double getGiaMua(){
        return giaMua;
    }
    public MatHang(String maMatHang,String tenMatHang,String nhomMatHang,double giaMua,double giaBan){
        this.giaBan = giaBan;
        this.giaMua = giaMua;
        this.maMatHang = maMatHang;
        this.nhomMatHang = nhomMatHang;
        this.tenMatHang = tenMatHang;
    }
    public double loiNhuan(){
        return getGiaBan()-getGiaMua();
    }
    public String toString(){
        return maMatHang+" "+tenMatHang+" "+nhomMatHang+" "+String.format("%.2f",(double)loiNhuan());
    }
}
public class J07050 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<MatHang> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String tenmathang = sc.nextLine().trim();
            String nhommathang = sc.nextLine().trim();
            String mamathang = "000"+Integer.toString(i+1);
            double giamua = Double.parseDouble(sc.nextLine().trim());
            double giaban = Double.parseDouble(sc.nextLine().trim());
            a.add(new MatHang("MH"+mamathang.substring(mamathang.length()-2),tenmathang,nhommathang,giamua,giaban));
        }
        a.sort((mh1,mh2)->Double.compare(mh2.loiNhuan(), mh1.loiNhuan()));
        for(MatHang x:a){
            System.out.println(x);
        }
    }
}
