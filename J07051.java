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
import java.io.*;
import java.text.*;

class KhachHang{
    private String maKhachHang,tenKhachHang, soPhong;
    private int soNgay, soTien;
    public void setMaKhachHang(String maKhachHang){
        this.maKhachHang = maKhachHang;
    }
    public String getMaKhachHang(){
        return maKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang){
        this.tenKhachHang = tenKhachHang;
    }
    public String getTenKhachHang(){
        return tenKhachHang;
    }
    public void setSoPhong(String soPhong){
        this.soPhong = soPhong;
    }
    public String getSoPhong(){
        return soPhong;
    }
    public void setSoNgay(int soNgay){
        this.soNgay = soNgay;
    }
    public int getSoNgay(){
        return soNgay;
    }
    public int setSoTien(int tienDichVu,int songay){
        String tmp = getSoPhong();
        if(tmp.charAt(0)=='1')return songay*25+tienDichVu;
        if(tmp.charAt(0)=='2')return songay*34+tienDichVu;
        if(tmp.charAt(0)=='3')return songay*50+tienDichVu;
        if(tmp.charAt(0)=='4')return songay*80+tienDichVu;
        return 0;
    }
    public String chuanhoaTen(){
        String tmp = "";
        String[] arr = getTenKhachHang().split("\\s+");
        for(String x:arr){
            tmp += x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return tmp;
    }
    public KhachHang(String maKhachHang,String tenKhachHang,String soPhong,int soTien,int soNgay){
        this.tenKhachHang = tenKhachHang;
        this.soPhong = soPhong;
        this.soTien = soTien;
        this.soNgay = soNgay;
        this.maKhachHang = maKhachHang;
    }
    public int getSoTien(){
        return soTien;
    }
    public String toString(){
        return maKhachHang+" "+chuanhoaTen()+" "+soPhong+" "+Integer.toString(soNgay)+" "+Integer.toString(soTien);
    }
}
public class J07051 {
    public static int tinhSoNgayLuuTru(String ngayDen,String ngayDi)throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = dateFormat.parse(ngayDen);
        Date d2 = dateFormat.parse(ngayDi);
        long diff = d2.getTime()-d1.getTime();
        return (int) (diff/(1000*60*60*24));
    }
    public static int tinhSoTien(int tienDichVu,int songay,String tmp){
        if(tmp.charAt(0)=='1')return songay*25+tienDichVu;
        if(tmp.charAt(0)=='2')return songay*34+tienDichVu;
        if(tmp.charAt(0)=='3')return songay*50+tienDichVu;
        if(tmp.charAt(0)=='4')return songay*80+tienDichVu;
        return 0;
    }
    public static void main(String[] args)throws IOException, ParseException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<KhachHang> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String makh = "000"+Integer.toString(i+1);
            String tenkh = sc.nextLine().trim();
            String sophong = sc.nextLine().trim();
            String ngayDen = sc.nextLine().trim();
            String ngayDi = sc.nextLine().trim();
            int tiendv = Integer.parseInt(sc.nextLine().trim());
            int ngayluutru = tinhSoNgayLuuTru(ngayDen,ngayDi);
            int sotien = tinhSoTien(tiendv,ngayluutru+1,sophong);
            a.add(new KhachHang("KH"+makh.substring(makh.length()-2),tenkh,sophong,sotien,ngayluutru+1));
        }
        a.sort((kh1,kh2)->kh2.getSoTien()-kh1.getSoTien());
        for(KhachHang x:a){
            System.out.println(x);
        }
    }
}
