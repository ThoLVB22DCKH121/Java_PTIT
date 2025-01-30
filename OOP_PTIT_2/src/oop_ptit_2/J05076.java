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
class MatHang76{
    private String maMH, tenMH, xeploai;

    public MatHang76(String maMH, String tenMH, String xeploai) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.xeploai = xeploai;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getXeploai() {
        return xeploai;
    }
    
}
class ThongKe76{
    private String ma, ten;
    private long gianhap, giaxuat;

    public ThongKe76(String ma, String ten, long dongianhap, long sln, long slx, String rank) {
        this.ma = ma;
        this.ten = ten;
        this.gianhap = dongianhap*sln;
        if(rank.equals("A"))this.giaxuat = Math.round(dongianhap*slx*108/100.0);
        else if(rank.equals("B"))this.giaxuat = Math.round(dongianhap*slx*105/100.0);
        else this.giaxuat = Math.round(dongianhap*slx*102/100.0);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gianhap + " " + giaxuat;
    }
    
}
public class J05076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, MatHang76> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            String rank = sc.next();
            mp.put(ma, new MatHang76(ma,ten,rank));
        }
        int m = sc.nextInt();
        ArrayList<ThongKe76> arr = new ArrayList<>();
        for(int i=0;i<m;i++){
            String ma = sc.next();
            long sln = sc.nextLong();
            long dongianhap = sc.nextLong();
            long slx = sc.nextLong();
            arr.add(new ThongKe76(ma,mp.get(ma).getTenMH(),dongianhap,sln,slx,mp.get(ma).getXeploai()));
        }
        for(ThongKe76 x:arr){
            System.out.println(x);
        }
    }
}
/*
2
A001
Tu lanh
A
P002
May giat
B
2
A001 500 100 300
P002 1000 1000 500
*/
