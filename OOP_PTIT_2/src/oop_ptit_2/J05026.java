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
class GiangVien1{

    private String maGiangVien, tenGiangVien, maMon;

    public GiangVien1(String maGiangVien, String tenGiangVien, String maMon) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
        this.maMon = maMon;
    }

    @Override
    public String toString() {
        return  maGiangVien + " " + tenGiangVien + " " + maMon;
    }

    public String getMaMon() {
        return maMon;
    }
    
}

public class J05026 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien1> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String mgv = "000"+Integer.toString(i+1);
            String tgv = sc.nextLine();
            String mh = sc.nextLine();
            String tmp = "";
            String[] ch = mh.trim().split("\\s+");
            for(String x:ch)tmp+=x.substring(0,1).toUpperCase();
            arr.add(new GiangVien1("GV"+mgv.substring(mgv.length()-2),tgv,tmp));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String bomon = sc.nextLine();
            String tmp = "";
            String[] ch = bomon.trim().split("\\s+");
            for(String x:ch)tmp+=x.substring(0,1).toUpperCase();
            System.out.println("DANH SACH GIANG VIEN BO MON "+tmp+":");
            for(GiangVien1 x:arr){
                if(x.getMaMon().equals(tmp))System.out.println(x);
            }
        }
    }
}
