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
class SanPham{
    private String maSP, tenSP;
    private long dongia1, dongia2;

    public SanPham(String maSP, String tenSP, long dongia1, long dongia2) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.dongia1 = dongia1;
        this.dongia2 = dongia2;
    }

    public String getTenSP() {
        return tenSP;
    }

    public long getDongia1() {
        return dongia1;
    }

    public long getDongia2() {
        return dongia2;
    }
    
}
class HoaDon{
    private String maHD, tenSP;
    private long  giamgia, thanhtien;

    public HoaDon(String ma, long sl, long dongia, String tenSP) {
        this.maHD = ma;
        this.tenSP = tenSP;
        this.thanhtien = sl*dongia;
        if(sl>=150)this.giamgia = Math.round(this.thanhtien*50/100.0);
        else if(sl>=100)this.giamgia = Math.round(this.thanhtien*30/100.0);
        else if(sl>=50)this.giamgia = Math.round(this.thanhtien*15/100.0);
        else this.giamgia = 0;
    }

    @Override
    public String toString() {
        return maHD + " " + tenSP + " " + giamgia + " " + (thanhtien-giamgia);
    }
    
}
public class J06001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,SanPham> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            long dongia1 = sc.nextLong();
            long dongia2 = sc.nextLong();
            mp.put(ma, new SanPham(ma,ten,dongia1,dongia2));
        }
        int m = sc.nextInt();
        ArrayList<HoaDon> arr = new ArrayList<>();
        for(int i=0;i<m;i++){
            String ma = sc.next();
            long sl = sc.nextLong();
            long dongia = 0;
            if(ma.charAt(2)=='1')dongia = mp.get(ma.substring(0,2)).getDongia1();
            else dongia = mp.get(ma.substring(0,2)).getDongia2();
            arr.add(new HoaDon(ma+String.format("-%03d", i+1),sl,dongia,mp.get(ma.substring(0,2)).getTenSP()));
        }
        for(HoaDon x:arr){
            System.out.println(x);
        }
    }
}
/*
2
AT
Ao thun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105
*/