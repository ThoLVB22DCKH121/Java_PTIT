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
class SinhVien implements Comparable<SinhVien>{
    private String maSinhVien, lopSinhVien, tenSinhVien, emailSinhVien;
    public SinhVien(String maSinhVien,String tenSinhVien, String lopSinhVien,String emailSinhVien){
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.lopSinhVien = lopSinhVien;
        this.emailSinhVien = emailSinhVien;
    }
    public String chuanhoaTen(){
        String tmp = "";
        String[] arr = tenSinhVien.split("\\s+");
        for(String x:arr){
            tmp += x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return tmp;
    }
    public String toString(){
        return maSinhVien+" "+chuanhoaTen()+lopSinhVien+" "+emailSinhVien;
    }
    public int compareTo(SinhVien a){
        return this.maSinhVien.compareTo(a.maSinhVien);
    }
}
public class J07033 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String maSinhVien = sc.nextLine().trim();
            String tenSinhVien = sc.nextLine().trim();
            String lopSinhVien = sc.nextLine().trim();
            String emailSinhVien = sc.nextLine().trim();
            a.add(new SinhVien(maSinhVien,tenSinhVien,lopSinhVien,emailSinhVien));
        }
        Collections.sort(a);
        for(SinhVien x:a){
            System.out.println(x);
        }
    }
}
