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
class SinhVien2 implements Comparable<SinhVien2>{
    private String maSinhVien, tenSinhVien, lopSinhVien, emailSinhVien;

    public SinhVien2(String maSinhVien, String tenSinhVien, String lopSinhVien, String emailSinhVien) {
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
    
    public int compareTo(SinhVien2 s){
        return this.maSinhVien.compareTo(s.maSinhVien);
    }
    
}
public class J05021 {
     public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien2> arr = new ArrayList<>();
        while(sc.hasNextLine()){
            String msv = sc.nextLine();
            String tsv = sc.nextLine();
            String lsv = sc.nextLine();
            String esv = sc.nextLine();
            arr.add(new SinhVien2(msv,tsv,lsv,esv));
        }
        Collections.sort(arr);
        for(SinhVien2 x:arr)System.out.println(x);
    }
}
