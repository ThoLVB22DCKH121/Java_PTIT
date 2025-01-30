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
class SinhVien4{
    private String maSinhVien, tenSinhVien, lopSinhVien, emailSinhVien;

    public SinhVien4(String maSinhVien, String tenSinhVien, String lopSinhVien, String emailSinhVien) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.lopSinhVien = lopSinhVien;
        this.emailSinhVien = emailSinhVien;
    }

    public String toString() {
        return maSinhVien + " " + tenSinhVien + " " + lopSinhVien + " " + emailSinhVien;
    }

    public String getLopSinhVien() {
        return lopSinhVien;
    }

    
}
public class J05023 {
     public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien4> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String msv = sc.nextLine();
            String tsv = sc.nextLine();
            String lsv = sc.nextLine();
            String esv = sc.nextLine();
            arr.add(new SinhVien4(msv,tsv,lsv,esv));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String khoa = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+khoa+":");
            for(SinhVien4 x:arr){
                if(x.getLopSinhVien().substring(1, 3).equals(khoa.substring(2)))System.out.println(x);
            }
        }
    }
}
