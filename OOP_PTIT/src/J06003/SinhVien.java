/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06003;

/**
 *
 * @author LE VAN THO
 */
public class SinhVien{
    private String maSinhVien,tenSinhVien,sdt;
    private int soNhom;

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getSoNhom() {
        return soNhom;
    }

    public void setSoNhom(int soNhom) {
        this.soNhom = soNhom;
    }
    
    
    public SinhVien(String maSinhVien,String tenSinhVien,String sdt,int soNhom){
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.sdt = sdt;
        this.soNhom = soNhom;
    }
    
    public String toString(){
        return maSinhVien+" "+tenSinhVien+" "+sdt;
    }
}
