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
class DonHang49 implements Comparable<DonHang49>{
    private String maDH;
    private long sln,slx,dongia,tien,thue;

    public DonHang49(String maDH, long sl) {
        this.maDH = maDH;
        this.sln = sl;
        
        if(maDH.charAt(0)=='A')this.slx = Math.round(this.sln*60/100.0);
        else this.slx = Math.round(this.sln*70/100.0);
        
        if(maDH.charAt(4)=='Y')this.dongia = 110000;
        else this.dongia = 135000;
        
        this.tien = this.dongia*this.slx;
        
        if(maDH.charAt(0)=='A'&&maDH.charAt(4)=='Y'){
            this.thue = this.tien*8/100;
        }
        else if(maDH.charAt(0)=='A'&&maDH.charAt(4)=='N'){
            this.thue = this.tien*11/100;
        }
        else if(maDH.charAt(0)=='B'&&maDH.charAt(4)=='Y'){
            this.thue = this.tien*17/100;
        }
        else if(maDH.charAt(0)=='B'&&maDH.charAt(4)=='N'){
            this.thue = this.tien*22/100;
        }
    }

    @Override
    public String toString() {
        return maDH + " " + sln + " " + slx + " " + dongia + " " + tien + " " + thue;
    }

    public String getMaDH() {
        return maDH;
    }
    public int compareTo(DonHang49 other){
        return Long.compare(other.thue, this.thue);
    }
    
}
public class J05049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DonHang49> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma = sc.next();
            long sl = sc.nextLong();
            arr.add(new DonHang49(ma,sl));
        }
        Collections.sort(arr);
        String s = sc.next();
        for(DonHang49 x:arr){
            if(x.getMaDH().charAt(0)==s.charAt(0))System.out.println(x);
        }
    }
}
/*
3
A001Y
1000
B012N
2500
B003Y
4582
*/