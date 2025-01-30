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
class NhanVien43{
    private String maNV, tenNV, chucvu;
    private long phucap, luong, tamung, conlai;
    
    public NhanVien43(String ma,String ten, String chucvu, long lcb, long ngaycong){
        this.tenNV = ten;
        this.maNV = ma;
        this.chucvu = chucvu;
        if(chucvu.equals("GD"))this.phucap = 500;
        else if(chucvu.equals("PGD"))this.phucap = 400;
        else if(chucvu.equals("TP"))this.phucap = 300;
        else if(chucvu.equals("KT"))this.phucap = 250;
        else this.phucap = 100;
        this.luong = lcb*ngaycong;
        if(((this.luong+this.phucap)*2/3.0)<25000){
            this.tamung = Math.round(((this.luong+this.phucap)*2/3.0)/1000)*1000;
        }
        else this.tamung = 25000;
        this.conlai = this.luong-this.tamung+this.phucap;
    }

    @Override
    public String toString() {
        return maNV + " " + tenNV + " " + phucap + " " + luong + " " + tamung + " " + conlai;
    }

    public String getChucvu() {
        return chucvu;
    }
    
}
public class J05044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien43> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma = String.format("NV%02d", i+1);
            sc.nextLine();
            String ten = sc.nextLine();
            String cv = sc.next();
            long lcb = sc.nextLong();
            long ngaycong = sc.nextLong();
            arr.add(new NhanVien43(ma,ten,cv,lcb,ngaycong));
        }
        String cv = sc.next();
        for(NhanVien43 x:arr){
            if(x.getChucvu().equals(cv))System.out.println(x);
        }
    }
}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
*/