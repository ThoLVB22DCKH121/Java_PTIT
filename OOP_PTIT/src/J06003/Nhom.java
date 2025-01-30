/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06003;

/**
 *
 * @author LE VAN THO
 */
public class Nhom {
    private String tenBaiTap;
    private int soNhom;

    public String getTenBaiTap() {
        return tenBaiTap;
    }

    public void setTenBaiTap(String tenBaiTap) {
        this.tenBaiTap = tenBaiTap;
    }

    public int getSoNhom() {
        return soNhom;
    }

    public void setSoNhom(int soNhom) {
        this.soNhom = soNhom;
    }
    
    public Nhom(int soNhom, String tenBaiTap){
        this.soNhom = soNhom;
        this.tenBaiTap = tenBaiTap;
    }
    
    public String toString(){
        return tenBaiTap;
    }
}
