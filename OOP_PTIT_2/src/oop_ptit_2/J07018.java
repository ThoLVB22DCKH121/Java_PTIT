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
class SinhVien8{
    private String maSinhVien, tenSinhVien, lopSinhVien, ngaySinh;
    private float gpa;

    public SinhVien8(String maSinhVien, String tenSinhVien, String lopSinhVien, String ngaySinh, float gpa) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.lopSinhVien = lopSinhVien;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    
    public String chuanhoa1(){
        String[] arr = ngaySinh.trim().split("/");
        String tmp = "";
        for(String x:arr){
            if(x.length()%2!=0){
                tmp += "0" + x + "/";
            }
            else tmp += x + "/";
        }
        return tmp.substring(0, tmp.length()-1);
    }
    
    public String chuanhoa2(){
        String[] arr = tenSinhVien.trim().split("\\s+");
        String tmp = "";
        for(String x:arr){
            tmp += x.substring(0, 1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return tmp.trim();
    }
    
    @Override
    public String toString() {
        return maSinhVien + " " + chuanhoa2() + " " + lopSinhVien + " " + chuanhoa1() + " " + String.format("%.2f", gpa);
    }
    
    
    
}
public class J07018 {
    public static void main(String[] agrs)throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien8> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String msv = "0000"+Integer.toString(i+1);
            String tsv = sc.nextLine().trim();
            String lsv = sc.nextLine().trim();
            String ns = sc.nextLine().trim();
            float gpa = Float.parseFloat(sc.nextLine());
            arr.add(new SinhVien8("B20DCCN"+msv.substring(msv.length()-3),tsv,lsv,ns,gpa));
        }
        for(SinhVien8 x : arr)System.out.println(x);
    }
}
