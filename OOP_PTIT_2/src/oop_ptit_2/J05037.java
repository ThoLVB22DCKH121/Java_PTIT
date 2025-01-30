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
class MatHang37 implements Comparable<MatHang37>{
    private String maMH, tenMH, dvTinh;
    private long phivc, thanhtien, giaban;

    public MatHang37(String maMH, String tenMH, String dvTinh, long phivc, long thanhtien, long giaban) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.dvTinh = dvTinh;
        this.phivc = phivc;
        this.thanhtien = thanhtien;
        this.giaban = giaban;
    }

    @Override
    public String toString() {
        if(giaban%100!=0)giaban = giaban-giaban%100+100;
        return maMH + " " + tenMH + " " + dvTinh + " " + phivc + " " + thanhtien + " " + giaban;
    }
    public int compareTo(MatHang37 other){
        return Long.compare(other.giaban, this.giaban);
    }
}
public class J05037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang37> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma = String.format("MH%02d",i+1);
            sc.nextLine();
            String ten = sc.nextLine();
            String dv = sc.nextLine();
            double gianhap = sc.nextDouble();
            double sl = sc.nextDouble();
            double tmp = gianhap*sl;
            arr.add(new MatHang37(ma,ten,dv,Math.round(tmp*5.0/100.0),Math.round(tmp*105.0/100.0),Math.round(tmp*1071.0/1000.0/sl)));
        }
        Collections.sort(arr);
        for(MatHang37 x:arr){
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