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
class NhanVien38{
    private String maNV, tenNV;
    private long luong, thuong, phucap, thuclinh;

    public NhanVien38(String maNV, String tenNV,long ngaycong, long luongngay, String chucvu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luongngay*ngaycong;
        if(ngaycong>=25)this.thuong = this.luong*20/100;
        else if(ngaycong>=22)this.thuong = this.luong*10/100;
        else this.thuong = 0;
        if(chucvu.equals("GD"))this.phucap = 250000;
        else if(chucvu.equals("PGD"))this.phucap = 200000;
        else if(chucvu.equals("TP"))this.phucap = 180000;
        else this.phucap = 150000;
        this.thuclinh = this.luong + this.phucap + this.thuong;
    }

    @Override
    public String toString() {
        return maNV + " " + tenNV + " " + luong + " " + thuong + " " + phucap + " " + thuclinh;
    }

    public long getThuclinh() {
        return thuclinh;
    }
    
}
public class J05040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien38> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma = String.format("NV%02d", i+1);
            sc.nextLine();
            String ten = sc.nextLine();
            long luongngay = sc.nextLong();
            long ngaycong = sc.nextLong();
            String cv = sc.next();
            arr.add(new NhanVien38(ma,ten,ngaycong,luongngay,cv));
        }
        for(NhanVien38 x:arr){
            System.out.println(x);
        }
    }
}
/*
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV
*/