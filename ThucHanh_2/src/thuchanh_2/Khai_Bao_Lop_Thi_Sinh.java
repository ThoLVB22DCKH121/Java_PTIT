/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_2;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
class SinhVien{
    private String tenSinhVien,ngaySinh;
    private float tongDiem;

    public SinhVien(String tenSinhVien, String ngaySinh, float tongDiem) {
        this.tenSinhVien = tenSinhVien;
        this.ngaySinh = ngaySinh;
        this.tongDiem = tongDiem;
    }
    

    @Override
    public String toString() {
        return tenSinhVien + " " + ngaySinh + " " + String.format("%.1f", tongDiem);
    }
    
}
public class Khai_Bao_Lop_Thi_Sinh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String tsv = sc.nextLine();
        String ns = sc.nextLine();
        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        SinhVien a = new SinhVien(tsv,ns,m1+m2+m3);
        System.out.print(a);
    }
}
