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
import java.math.*;
class MatHang36{
    private String maMH, tenMH, dvTinh;
    private long phivc, thanhtien, giaban;

    public MatHang36(String maMH, String tenMH, String dvTinh, long phivc, long thanhtien, long giaban) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.dvTinh = dvTinh;
        this.phivc = phivc;
        this.thanhtien = thanhtien;
        this.giaban = giaban;
    }

    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + dvTinh + " " + phivc + " " + thanhtien + " " + giaban;
    }
    
}
public class J05036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang36> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma = String.format("MH%02d",i+1);
            sc.nextLine();
            String ten = sc.nextLine();
            String dv = sc.nextLine();
            double gianhap = sc.nextDouble();
            double sl = sc.nextDouble();
            double tmp = gianhap*sl;
            arr.add(new MatHang36(ma,ten,dv,Math.round(tmp*5.0/100.0),Math.round(tmp*105.0/100.0),Math.round(tmp*1071.0/1000)));
        }
        for(MatHang36 x:arr){
            System.out.println(x);
        }
    }
}
/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
*/