/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit_2;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.io.*;
class KhachHang20{
    private String maKH, tenKH, gioitinh, ngaysinh,diachi;

    public KhachHang20(String maKH, String tenKH, String gioitinh, String ngaysinh, String diachi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }
    
}
class MatHang20{
    private String maMH, tenMH, dvtinh;
    private long giamua, giaban;

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getDvtinh() {
        return dvtinh;
    }

    public long getGiamua() {
        return giamua;
    }

    public long getGiaban() {
        return giaban;
    }

    public MatHang20(String maMH, String tenMH, String dvtinh, long giamua, long giaban) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.dvtinh = dvtinh;
        this.giamua = giamua;
        this.giaban = giaban;
    }
}
class HoaDon20{
    private String maHD;
    private KhachHang20 a;
    private MatHang20 b;
    private long sl, thanhtien;

    public HoaDon20(String maHD, KhachHang20 a, MatHang20 b, long sl) {
        this.maHD = maHD;
        this.a = a;
        this.b = b;
        this.sl = sl;
        this.thanhtien = sl*b.getGiaban();
    }

    @Override
    public String toString() {
        return maHD + " " + a.getTenKH() + " " + a.getDiachi() + " " + b.getTenMH() + " " + b.getDvtinh()+" "+b.getGiamua()+" "+b.getGiaban()+" "+sl+" "+thanhtien;
    }
}
public class J07020 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("KH.in"));
        Map<String,KhachHang20> mp1 = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            String ma = String.format("KH%03d", i+1);
            String ten = sc.nextLine().trim();
            String gioitinh = sc.nextLine().trim();
            String ns = sc.nextLine().trim();
            String dc = sc.nextLine().trim();
            mp1.put(ma,new KhachHang20(ma,ten,gioitinh,ns,dc));
        }
        sc.close();
        sc = new Scanner(new File("MH.in"));
        Map<String,MatHang20> mp2 = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<m;i++){
            String ma = String.format("MH%03d", i+1);
            String ten = sc.nextLine().trim();
            String dv = sc.nextLine().trim();
            long giamua = Long.parseLong(sc.nextLine().trim());
            long giaban = Long.parseLong(sc.nextLine().trim());
            mp2.put(ma, new MatHang20(ma,ten,dv,giamua,giaban));
        }
        sc.close();
        sc = new Scanner(new File("HD.in"));
        int k = Integer.parseInt(sc.nextLine().trim());
        ArrayList<HoaDon20> arr = new ArrayList<>();
        for(int i=0;i<k;i++){
            String ma = String.format("HD%03d", i+1);
            String makh = sc.next().trim();
            String mamh = sc.next().trim();
            long sl = sc.nextLong();
            arr.add(new HoaDon20(ma,mp1.get(makh),mp2.get(mamh),sl));
        }
        for(HoaDon20 x:arr){
            System.out.println(x);
        }
    }
}
