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
class DonHang67{
    private String maDonHang, tenHang;
    private long dongia,thue,thanhtien;

    public DonHang67(String maDonHang, long soluong) {
        this.maDonHang = maDonHang;
        String tmp1 = maDonHang.substring(0,1);
        String tmp2 = maDonHang.substring(3);
        if(tmp1.equals("X")){
            this.dongia = 128000;
            this.thue = soluong*128000*3/100;
            this.thanhtien = soluong*this.dongia+this.thue;
        }
        else if(tmp1.equals("D")){
            this.dongia = 11200;
            this.thue = soluong*11200*7/200;
            this.thanhtien = soluong*this.dongia+this.thue;
        }
        else if(tmp1.equals("N")){
            this.dongia = 9700;
            this.thue = soluong*9700*2/100;
            this.thanhtien = soluong*this.dongia+this.thue;
        }
        if(tmp2.equals("BP"))this.tenHang = "British Petro";
        else if(tmp2.equals("ES"))this.tenHang = "Esso";
        else if(tmp2.equals("SH"))this.tenHang = "Shell";
        else if(tmp2.equals("CA"))this.tenHang = "Castrol";
        else if(tmp2.equals("MO"))this.tenHang = "Mobil";
        else if(tmp2.equals("TN")){
            this.tenHang = "Trong Nuoc";
            this.thanhtien = this.thanhtien - this.thue;
            this.thue = 0;
        }
    }

    @Override
    public String toString() {
        return maDonHang + " " + tenHang + " " + dongia + " " + thue + " " + thanhtien;
    }
    
}
public class J05067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DonHang67> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma = sc.next();
            long soluong = sc.nextLong();
            arr.add(new DonHang67(ma,soluong));
        }
        for(DonHang67 x:arr){
            System.out.println(x);
        }
    }
}
/*
3
N89BP 4500
D00BP 3500
X92SH 2600
*/