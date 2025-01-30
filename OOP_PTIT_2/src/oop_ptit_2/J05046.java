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
class DonHang46{
    private String maDH, tenDH;
    private long tienck, thanhtien;

    public DonHang46(String maDH, String tenDH, long sl, long dongia) {
        this.maDH = maDH;
        this.tenDH = tenDH;
        if(sl>10)this.tienck = dongia*sl*5/100;
        else if(sl>=8)this.tienck = dongia*sl*2/100;
        else if(sl>=5)this.tienck = dongia*sl*1/100;
        else this.tienck = 0;
        this.thanhtien = sl*dongia-this.tienck;
    }

    @Override
    public String toString() {
        return maDH + " " + tenDH + " " + tienck + " " + thanhtien;
    }
    
}
public class J05046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DonHang46> arr = new ArrayList<>();
        Map<String,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ten = sc.nextLine();
            long sl = sc.nextLong();
            long dongia = sc.nextLong();
            String[] s = ten.trim().split("\\s+");
            String ma = s[0].substring(0,1).toUpperCase()+s[1].substring(0,1).toUpperCase();
            if(mp.containsKey(ma)){
                arr.add(new DonHang46(String.format(ma+"%02d", mp.get(ma)+1),ten,sl,dongia));
                mp.put(ma, mp.get(ma)+1);
            }
            else {
                arr.add(new DonHang46(String.format(ma+"%02d", 1),ten,sl,dongia));
                mp.put(ma, 1);
            }
        }
        for(DonHang46 x:arr){
            System.out.println(x);
        }
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
*/