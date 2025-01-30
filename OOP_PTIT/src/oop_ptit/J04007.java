/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.Scanner;

class Nhanvien{
    private String mnv = "00001", ten, gioitinh, ngaysinh, diachi, mst, ngayhd;
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getTen(){
        return ten;
    }
    public void setGioitinh(String gioitinh){
        this.gioitinh = gioitinh;
    }
    public String getGioitinh(){
        return gioitinh;
    }
    public void setNgaysinh(String ngaysinh){
        this.ngaysinh = ngaysinh;
    }
    public String getNgaysinh(){
        return ngaysinh;
    }
    public void setDiachi(String diachi){
        this.diachi = diachi;
    }
    public String getDiachi(){
        return diachi;
    }
    public void setMst(String mst){
        this.mst = mst;
    }
    public String getMst(){
        return mst;
    }
    public void setNgayhd(String ngayhd){
        this.ngayhd = ngayhd;
    }
    public String getNgayhd(){
        return ngayhd;
    }
    public String getMnv(){
        return mnv;
    }
}
public class J04007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Nhanvien a = new Nhanvien();
        a.setTen(sc.nextLine());
        a.setGioitinh(sc.next());
        a.setNgaysinh(sc.next());
        sc.nextLine();
        a.setDiachi(sc.nextLine());
        a.setMst(sc.next());
        a.setNgayhd(sc.next());
        System.out.print(a.getMnv()+" "+a.getTen()+" "+a.getGioitinh()+" "+a.getNgaysinh());
        System.out.print(" "+a.getDiachi()+" "+a.getMst()+" "+a.getNgayhd());
    }
}
