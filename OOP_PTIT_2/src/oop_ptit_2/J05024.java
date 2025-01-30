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
class SinhVien5{
    private String maSinhVien, tenSinhVien, lopSinhVien, emailSinhVien;

    public SinhVien5(String maSinhVien, String tenSinhVien, String lopSinhVien, String emailSinhVien) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.lopSinhVien = lopSinhVien;
        this.emailSinhVien = emailSinhVien;
    }

    public String toString() {
        return maSinhVien + " " + tenSinhVien + " " + lopSinhVien + " " + emailSinhVien;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getLopSinhVien() {
        return lopSinhVien;
    }
}
public class J05024 {
     public static String chuanhoaNganh(String s,String lop){
         if(s.equals("ke toan"))return "DCKT";
         else if(s.equals("cong nghe thong tin")&&lop.charAt(0)!='E')return "DCCN";
         else if(s.equals("an toan thong tin")&&lop.charAt(0)!='E')return "DCAT";
         else if(s.equals("vien thong"))return "DCVT";
         else if(s.equals("dien tu"))return "DCDT";
         else return "";
     }
     public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien5> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String msv = sc.nextLine();
            String tsv = sc.nextLine();
            String lsv = sc.nextLine();
            String esv = sc.nextLine();
            arr.add(new SinhVien5(msv,tsv,lsv,esv));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String nganh = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH "+nganh.toUpperCase()+":");
            for(SinhVien5 x:arr){
                if(x.getMaSinhVien().substring(3, 7).equals(chuanhoaNganh(nganh.toLowerCase(),x.getLopSinhVien())))System.out.println(x);
            }
        }
    }
}
