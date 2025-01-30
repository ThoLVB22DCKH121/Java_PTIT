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
class DonHang52{
    private String tenDH, maDH, sttDH;
    private long giamgia, thanhtien;
    
    public DonHang52(String ten, String ma, long dongia, long sl){
        this.maDH = ma;
        this.tenDH = ten;
        this.sttDH = ma.substring(1,4);
        if(ma.charAt(4)=='1')this.giamgia = Math.round(dongia*sl*50/100.0);
        else this.giamgia = Math.round(dongia*sl*30/100.0);
        this.thanhtien = sl*dongia-this.giamgia;
    }
    @Override
    public String toString() {
        return tenDH + " " + maDH + " " + sttDH + " " + giamgia + " " + thanhtien;
    }
    
}
public class J05052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DonHang52> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ma = sc.next();
            long dongia = sc.nextLong();
            long sl = sc.nextLong();
            arr.add(new DonHang52(ten,ma,dongia,sl));
        }
        for(DonHang52 x:arr){
            System.out.println(x);
        }
            
    }
}
/*
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
*/