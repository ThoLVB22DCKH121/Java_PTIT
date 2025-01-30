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
class SinhVien6{
    private String maSinhVien, tenSinhVien, lopSinhVien;
    private float m1,m2,m3;

    public SinhVien6(String maSinhVien, String tenSinhVien, String lopSinhVien, float m1, float m2, float m3) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.lopSinhVien = lopSinhVien;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    @Override
    public String toString() {
        return maSinhVien + " " + tenSinhVien + " " + lopSinhVien + " " + String.format("%.1f", m1) + " " + String.format("%.1f", m2) + " " + String.format("%.1f", m3);
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }
    
}
public class J05030 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 1;
        sc.nextLine();
        ArrayList<SinhVien6> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String msv = sc.nextLine();
            String tsv = sc.nextLine();
            String lsv = sc.nextLine();
            float m1 = sc.nextFloat();
            float m2 = sc.nextFloat();
            float m3 = sc.nextFloat();
            sc.nextLine();
            arr.add(new SinhVien6(msv,tsv,lsv,m1,m2,m3));
        }
        arr.sort((s1,s2)->s1.getMaSinhVien().compareTo(s2.getMaSinhVien()));
        for(SinhVien6 x:arr){
            System.out.print(cnt++);
            System.out.println(" "+x);
        }
    }
}
