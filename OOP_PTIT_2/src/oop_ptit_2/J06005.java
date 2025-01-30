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
class KhachHang05{
    private String maKH, tenKH, gioitinh, ngaysinh, diachi;

    public KhachHang05(String maKH, String tenKH, String gioitinh, String ngaysinh, String diachi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return tenKH + " " + diachi;
    }
    
}
class MatHang05{
    private String maMH, tenMH, dvtinh;
    private long giamua, giaban;

    public MatHang05(String maMH, String tenMH, String dvtinh, long giamua, long giaban) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.dvtinh = dvtinh;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    @Override
    public String toString() {
        return tenMH + " " + dvtinh + " " + giamua + " " + giaban;
    }

    public long getGiaban() {
        return giaban;
    }
    
}
class HoaDon05{
    private String maHD;
    private KhachHang05 a;
    private MatHang05 b;
    private long sl, thanhtien;

    public HoaDon05(String maHD, KhachHang05 a, MatHang05 b, long sl) {
        this.maHD = maHD;
        this.a = a;
        this.b = b;
        this.sl = sl;
        this.thanhtien = sl*b.getGiaban();
    }

    @Override
    public String toString() {
        return maHD + " " + a + " " + b + " " + sl + " " + thanhtien;
    }
    
}
public class J06005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String,KhachHang05> mp1 = new HashMap<>();
        for(int i=0;i<n;i++){
            String ma = String.format("KH%03d", i+1);
            String ten = sc.nextLine();
            String gioitinh = sc.next();
            String ns = sc.next();
            sc.nextLine();
            String dc = sc.nextLine();
            mp1.put(ma, new KhachHang05(ma,ten,gioitinh,ns,dc));
        }
        int m = sc.nextInt();
        Map<String, MatHang05> mp2 = new HashMap<>();
        for(int i=0;i<m;i++){
            String ma = String.format("MH%03d", i+1);
            sc.nextLine();
            String ten = sc.nextLine();
            String dv = sc.nextLine();
            long giamua = sc.nextLong();
            long giaban = sc.nextLong();
            mp2.put(ma, new MatHang05(ma,ten,dv,giamua,giaban));
        }
        int k = sc.nextInt();
        ArrayList<HoaDon05> arr = new ArrayList<>();
        for(int i=0;i<k;i++){
            String ma = String.format("HD%03d", i+1);
            String makh = sc.next();
            String mamh = sc.next();
            long sl = sc.nextLong();
            arr.add(new HoaDon05(ma,mp1.get(makh),mp2.get(mamh),sl));
        }
        for(HoaDon05 x:arr){
            System.out.println(x);
        }
    }
}
/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
*/