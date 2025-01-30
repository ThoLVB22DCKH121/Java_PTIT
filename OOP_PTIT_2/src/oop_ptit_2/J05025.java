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
class GiangVien implements Comparable<GiangVien>{

    private String maGiangVien, tenGiangVien, maMon;

    public GiangVien(String maGiangVien, String tenGiangVien, String maMon) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
        this.maMon = maMon;
    }

    @Override
    public String toString() {
        return  maGiangVien + " " + tenGiangVien + " " + maMon;
    }
    
    public int compareTo(GiangVien g){
        if(!this.tenGiangVien.substring(this.tenGiangVien.lastIndexOf(" ")+1)
            .equals(g.tenGiangVien.substring(g.tenGiangVien.lastIndexOf(" ")+1))){
            return this.tenGiangVien.substring(this.tenGiangVien.lastIndexOf(" ")+1)
                   .compareTo(g.tenGiangVien.substring(g.tenGiangVien.lastIndexOf(" ")+1));
        }
        else return this.maGiangVien.compareTo(g.maGiangVien);
    }
}

public class J05025 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String mgv = "000"+Integer.toString(i+1);
            String tgv = sc.nextLine();
            String mh = sc.nextLine();
            String tmp = "";
            String[] ch = mh.trim().split("\\s+");
            for(String x:ch)tmp+=x.substring(0,1).toUpperCase();
            arr.add(new GiangVien("GV"+mgv.substring(mgv.length()-2),tgv,tmp));
        }
        Collections.sort(arr);
        for(GiangVien x:arr)System.out.println(x);
    }
}
