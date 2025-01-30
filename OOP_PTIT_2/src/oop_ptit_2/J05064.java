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
class GiaoVien64{
    private String maGiaoVien, tenGiaoVien;
    private long bacluong,phucap,thunhap;

    public GiaoVien64(String maGiaoVien, String tenGiaoVien, long bacluong, long phucap, long thunhap) {
        this.maGiaoVien = maGiaoVien;
        this.tenGiaoVien = tenGiaoVien;
        this.bacluong = bacluong;
        this.phucap = phucap;
        this.thunhap = thunhap;
    }

    @Override
    public String toString() {
        return maGiaoVien + " " + tenGiaoVien + " " + bacluong + " " + phucap + " " + thunhap;
    }
    
    
}
public class J05064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int HT = 1,HP = 2;
        ArrayList<GiaoVien64> arr = new ArrayList<>();       
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long lcb = sc.nextLong();
            String cv = ma.substring(0,2);
            long bl = Long.parseLong(ma.substring(2));
            if(HT>0&&cv.equals("HT")){
                arr.add(new GiaoVien64(ma,ten,bl,2000000,lcb*bl+2000000));
                HT--;
            }
            else if(HP>0&&cv.equals("HP")){
                arr.add(new GiaoVien64(ma,ten,bl,900000,lcb*bl+900000));
                HP--;
            }
            else if(cv.equals("GV")){
                arr.add(new GiaoVien64(ma,ten,bl,500000,lcb*bl+500000));
            }
        }
        for(GiaoVien64 x:arr){
            System.out.println(x);
        }
    }
}
/* 
3
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
*/