/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06004;

/**
 *
 * @author LE VAN THO
 */
public class SinhVien {

    private String maSinhVien, tenSinhVien, sdt;
    private int soNhom;

    public SinhVien(String maSinhVien, String tenSinhVien, String sdt, int soNhom) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.sdt = sdt;
        this.soNhom = soNhom;
    }

    public String toString() {
        return maSinhVien + " " + tenSinhVien + " " + sdt + " " + Integer.toString(soNhom) + " " + BaiTapLon.getBaiTapLon(soNhom);
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

}
