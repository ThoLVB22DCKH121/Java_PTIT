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
class SinhVien3{
    private String maSinhVien, tenSinhVien, lopSinhVien, emailSinhVien;

    public SinhVien3(String maSinhVien, String tenSinhVien, String lopSinhVien, String emailSinhVien) {
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
public class J05022 {
     public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien3> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String msv = sc.nextLine();
            String tsv = sc.nextLine();
            String lsv = sc.nextLine();
            String esv = sc.nextLine();
            arr.add(new SinhVien3(msv,tsv,lsv,esv));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String lsv = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+lsv+":");
            for(SinhVien3 x:arr){
                if(x.getLopSinhVien().equals(lsv))System.out.println(x);
            }
        }
    }
}
