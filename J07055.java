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

class SinhVien{
    private String maSinhVien, tenSinhVien, xepLoaiSinhVien;
    private float diemTong;
    public float getDiemTong(){
        return diemTong;
    }
    public String chuanhoaTen(){
        String tmp = "";
        String[] arr = tenSinhVien.split("\\s+");
        for(String x:arr){
            tmp += x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return tmp.trim();
    }
    public String toString(){
        return maSinhVien+" "+chuanhoaTen()+String.format(" %.2f", diemTong)+" "+xepLoaiSinhVien;
    }
    public SinhVien(String maSinhVien,String tenSinhVien,float diemTong,String xepLoaiSinhVien){
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.diemTong = diemTong;
        this.xepLoaiSinhVien = xepLoaiSinhVien;
    }
}
public class J07055 {
    public static float tinhDiemTrungBinh(float luyentap,float thuchanh,float diemthi){
        return (float)luyentap*25/100+(float)thuchanh*35/100+(float)diemthi*40/100;
    }
    public static String tinhXepLoaiSinhVien(float diemtrungbinh){
        if(diemtrungbinh>=8)return "GIOI";
        else if(diemtrungbinh>=6.5)return "KHA";
        //Chú ý phần in đi th nguuu
        else if(diemtrungbinh>=5)return "TRUNG BINH";
        else return "KEM";
    }
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String tmp = "000"+Integer.toString(i+1);
            String tenSinhVien = sc.nextLine().trim();
            float luyentap = Float.parseFloat(sc.nextLine().trim());
            float thuchanh = Float.parseFloat(sc.nextLine().trim());
            float diemthi = Float.parseFloat(sc.nextLine().trim());
            float diemtrungbinh = tinhDiemTrungBinh(luyentap,thuchanh,diemthi);
            String xepLoaiSinhVien = tinhXepLoaiSinhVien(diemtrungbinh);
            arr.add(new SinhVien("SV"+tmp.substring(tmp.length()-2),tenSinhVien,diemtrungbinh,xepLoaiSinhVien));
        }
        arr.sort((sv1,sv2)->Float.compare(sv2.getDiemTong(), sv1.getDiemTong()));
        for(SinhVien x:arr)System.out.println(x);
    }
}
