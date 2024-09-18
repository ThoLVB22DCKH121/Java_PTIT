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

class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String MaDN, TenDN;
    private int Sinhvien;
    public void setMaDN(String MaDN){
        this.MaDN = MaDN;
    }
    public String getMaDN(){
        return MaDN;
    }
    public void setTenDN(String TenDN){
        this.TenDN = TenDN;
    }
    public String getTenDN(){
        return TenDN;
    }
    public void setSinhvien(int Sinhvien){
        this.Sinhvien = Sinhvien;
    }
    public int getSinhvien(){
        return Sinhvien;
    }
    public int compareTo(DoanhNghiep a){
        return this.MaDN.compareTo(a.MaDN);
    }
    public String toString(){
        return getMaDN()+" "+getTenDN()+" "+Integer.toString(getSinhvien());
    }
    public DoanhNghiep(String MaDN,String TenDN,int Sinhvien){
        this.MaDN = MaDN;
        this.TenDN = TenDN;
        this.Sinhvien = Sinhvien;
    }
}
public class J07037 {
    public static void main(String[] args)throws IOException{
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String tmp1 = sc.nextLine();
            String tmp2 = sc.nextLine();
            int tmp3 = Integer.parseInt(sc.nextLine());
            arr.add(new DoanhNghiep(tmp1,tmp2,tmp3));
        }
        Collections.sort(arr);
        for(DoanhNghiep x : arr){
            System.out.println(x);
        }
    }
}
