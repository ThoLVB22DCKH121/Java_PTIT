/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;

class NhanVien {

    private String maNhanVien, tenNhanVien, gioitinhNhanVien, ngaySinh, diaChi, maSoThue, ngayKy;

    public NhanVien(String maNhanVien, String tenNhanVien, String gioitinhNhanVien, String ngaySinh, String diaChi, String maSoThue, String ngayKy) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.gioitinhNhanVien = gioitinhNhanVien;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKy = ngayKy;
    }

    public String toString() {
        return maNhanVien + " " + tenNhanVien + " " + gioitinhNhanVien + " " + ngaySinh + " " + diaChi + " " + maSoThue + " " + ngayKy;
    }
}

public class J05006 {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String mnv = "00000" + Integer.toString(i + 1);
            String tnv = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();
            String mst = sc.nextLine();
            String nk = sc.nextLine();
            arr.add(new NhanVien(mnv.substring(mnv.length() - 5), tnv, gt, ns, dc, mst, nk));
        }
        for (NhanVien x : arr) {
            System.out.println(x);
        }
    }
}
