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

class SinhVien implements Comparable<SinhVien> {

    private String maSinhVien, tenSinhVien, ngaySinh;
    private float tongDiem;

    public SinhVien(String maSinhVien, String tenSinhVien, String ngaySinh, float tongDiem) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.ngaySinh = ngaySinh;
        this.tongDiem = tongDiem;
    }

    public String toString() {
        return maSinhVien + " " + tenSinhVien + " " + ngaySinh + " " + Float.toString(tongDiem);
    }

    public int compareTo(SinhVien s) {
        if (this.tongDiem == s.tongDiem) {
            return this.maSinhVien.compareTo(s.maSinhVien);
        } else {
            return Float.compare(s.tongDiem, this.tongDiem);
        }
    }

    public float getTongDiem() {
        return tongDiem;
    }

}

public class J05009 {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String msv = Integer.toString(i + 1);
            String tsv = sc.nextLine();
            String ns = sc.nextLine();
            float m1 = sc.nextFloat();
            float m2 = sc.nextFloat();
            float m3 = sc.nextFloat();
            sc.nextLine();
            arr.add(new SinhVien(msv, tsv, ns, m1 + m2 + m3));
        }
        Collections.sort(arr);
        float thukhoa = arr.get(0).getTongDiem();
        for (SinhVien x : arr) {
            if (x.getTongDiem() == thukhoa) {
                System.out.println(x);
            }
        }
    }
}
