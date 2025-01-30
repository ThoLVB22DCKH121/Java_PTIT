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
class PhongBan{
    private String maP, tenP;

    public PhongBan(String maP, String tenP) {
        this.maP = maP;
        this.tenP = tenP;
    }

    @Override
    public String toString() {
        return tenP;
    }

    public String getMaP() {
        return maP;
    }
    
}
class NhanVien77{
    private String maNV, tenNV;
    private PhongBan a;
    private long luongthang;
    
    public long tinhluong(String a, long b){
        if(a.equals("A")&&1<=b&&b<=3) return 10;
        if(a.equals("A")&&4<=b&&b<=8) return 12;
        if(a.equals("A")&&9<=b&&b<=15) return 14;
        if(a.equals("A")&&b>=16) return 20;
        if(a.equals("B")&&1<=b&&b<=3) return 10;
        if(a.equals("B")&&4<=b&&b<=8) return 11;
        if(a.equals("B")&&9<=b&&b<=15) return 13;
        if(a.equals("B")&&b>=16) return 16;
        if(a.equals("C")&&1<=b&&b<=3) return 9;
        if(a.equals("C")&&4<=b&&b<=8) return 10;
        if(a.equals("C")&&9<=b&&b<=15) return 12;
        if(a.equals("C")&&b>=16) return 14;
        if(a.equals("D")&&1<=b&&b<=3) return 8;
        if(a.equals("D")&&4<=b&&b<=8) return 9;
        if(a.equals("D")&&9<=b&&b<=15) return 11;
        if(a.equals("D")&&b>=16) return 13;
        return 1;
    }
    public NhanVien77(String maNV, String tenNV, long lcb, long ngaycong, PhongBan a) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.a = a;
        this.luongthang = ngaycong*lcb*tinhluong(maNV.substring(0,1),Long.parseLong(maNV.substring(1,3)))*1000;
    }
    
    @Override
    public String toString() {
        return maNV + " " + tenNV + " " + a + " " + luongthang;
    }
    
}
public class J05077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String,PhongBan> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            mp.put(s.substring(0,2), new PhongBan(s.substring(0,2),s.substring(3)));
        }
        int m = sc.nextInt();
        ArrayList<NhanVien77> arr = new ArrayList<>();
        for(int i=0;i<m;i++){
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            long lcb = sc.nextLong();
            long ngaycong = sc.nextLong();
            arr.add(new NhanVien77(ma,ten,lcb,ngaycong,mp.get(ma.substring(3))));
        }
        for(NhanVien77 x:arr){
            System.out.println(x);
        }
    }
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
*/