/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuchanhbuoi3;


/**
 *
 * @author LE VAN THO
 */

import java.io.Serializable;
class SinhVien implements Serializable {
    private static int Id = 10001;
    private int maSV;                 
    private String hoTen;
    private String diaChi;
    private String ngaySinh;
    private String lop;

    // Constructor
    public SinhVien(String hoTen, String diaChi, String ngaySinh, String lop) {
        this.maSV = Id++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public SinhVien(int maSV, String hoTen, String diaChi, String ngaySinh, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }
    

    // Getters và Setters
    public int getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", ngaySinh=" + ngaySinh + ", lop=" + lop + '}';
    }
}

class MonHoc implements Serializable {
    private static int Id = 101;
    private int maMH;
    private String tenMon;
    private int soDVHT;
    private String loaiMon;

    public MonHoc(String tenMon, int soDVHT, String loaiMon) {
        this.maMH = Id++;
        this.tenMon = tenMon;
        this.soDVHT = soDVHT;
        this.loaiMon = loaiMon;
    }

    public MonHoc(int maMH, String tenMon, int soDVHT, String loaiMon) {
        this.maMH = maMH;
        this.tenMon = tenMon;
        this.soDVHT = soDVHT;
        this.loaiMon = loaiMon;
    }

    public int getMaMH() {
        return maMH;
    }

    public String getTenMon() {
        return tenMon;
    }

    public int getSoDVHT() {
        return soDVHT;
    }

    public String getLoaiMon() {
        return loaiMon;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public void setSoDVHT(int soDVHT) {
        this.soDVHT = soDVHT;
    }

    public void setLoaiMon(String loaiMon) {
        this.loaiMon = loaiMon;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "maMH=" + maMH + ", tenMon=" + tenMon + ", soDVHT=" + soDVHT + ", loaiMon=" + loaiMon + '}';
    }
}

class BangDiem implements Serializable {
    private SinhVien sinhVien;
    private MonHoc monHoc;
    private float diem;

    public BangDiem(SinhVien sinhVien, MonHoc monHoc, float diem) {
        this.sinhVien = sinhVien;
        this.monHoc = monHoc;
        this.diem = diem;
    }

    @Override
    public String toString() {
        return sinhVien.getHoTen() + "," + monHoc.getTenMon() + "," + diem;
    }
}
public class ThucHanhBuoi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
