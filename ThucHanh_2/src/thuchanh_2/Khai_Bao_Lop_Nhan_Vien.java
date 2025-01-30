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
class NhanVien{
    private String maNhanVien, tenNhanVien, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKy;

    public NhanVien(String maNhanVien, String tenNhanVien, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKy) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKy = ngayKy;
    }

    @Override
    public String toString() {
        return maNhanVien + " " + tenNhanVien + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maSoThue + " " + ngayKy;
    }
    
}
public class Khai_Bao_Lop_Nhan_Vien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NhanVien a = new NhanVien("00001",sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        System.out.print(a);
    }
}
