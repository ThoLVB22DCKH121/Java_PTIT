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
class SinhVien1 implements Comparable<SinhVien1>{
    private String maSinhVien, tenSinhVien, lopSinhVien, emailSinhVien;

    public SinhVien1(String maSinhVien, String tenSinhVien, String lopSinhVien, String emailSinhVien) {
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
    
    public int compareTo(SinhVien1 s){
        if(this.lopSinhVien.equals(s.lopSinhVien))return this.maSinhVien.compareTo(s.maSinhVien);
        else return this.lopSinhVien.compareTo(s.lopSinhVien);
    }
    
}
public class J05020 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien1> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String msv = sc.nextLine();
            String tsv = sc.nextLine();
            String lsv = sc.nextLine();
            String esv = sc.nextLine();
            arr.add(new SinhVien1(msv,tsv,lsv,esv));
        }
        Collections.sort(arr);
        for(SinhVien1 x:arr)System.out.println(x);
    }
}

