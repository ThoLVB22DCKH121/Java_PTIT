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
class NhanVien implements Comparable<NhanVien>{
    private String tenNhanVien,chucVu,soHieu,hesoLuong; 

    public NhanVien(String tenNhanVien, String chucVu, String soHieu, String hesoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.chucVu = chucVu;
        this.soHieu = soHieu;
        this.hesoLuong = hesoLuong;
    }

    @Override
    public String toString() {
        return tenNhanVien + " " + chucVu + " " + soHieu + " " + hesoLuong;
    }
    public int compareTo(NhanVien n){
        if(Integer.parseInt(this.hesoLuong)!=Integer.parseInt(n.hesoLuong))return Integer.compare(Integer.parseInt(n.hesoLuong), Integer.parseInt(this.hesoLuong));
        else return Integer.compare(Integer.parseInt(this.soHieu), Integer.parseInt(n.soHieu));
    }

    public String getChucVu() {
        return chucVu;
    }
    
}
public class J05065 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int gd = 1, tp = 3, pp = 3;
        ArrayList<NhanVien> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            if(s.substring(0, 2).toLowerCase().equals("gd")&&gd>0){
                res.add(new NhanVien(s.substring(8),"GD",s.substring(4,7),s.substring(2,4)));
                gd-=1;
            }
            else if(s.substring(0, 2).toLowerCase().equals("gd")&&gd==0){
                res.add(new NhanVien(s.substring(8),"NV",s.substring(4,7),s.substring(2,4)));
            }
            else if(s.substring(0, 2).toLowerCase().equals("tp")&&tp>0){
                res.add(new NhanVien(s.substring(8),"TP",s.substring(4,7),s.substring(2,4)));
                tp-=1;
            }
            else if(s.substring(0, 2).toLowerCase().equals("tp")&&tp==0){
                res.add(new NhanVien(s.substring(8),"NV",s.substring(4,7),s.substring(2,4)));
            }
            else if(s.substring(0, 2).toLowerCase().equals("pp")&&tp>0){
                res.add(new NhanVien(s.substring(8),"PP",s.substring(4,7),s.substring(2,4)));
                pp-=1;
            }
            else if(s.substring(0, 2).toLowerCase().equals("tp")&&tp==0){
                res.add(new NhanVien(s.substring(8),"NV",s.substring(4,7),s.substring(2,4)));
            }
            else res.add(new NhanVien(s.substring(8),"NV",s.substring(4,7),s.substring(2,4)));
        }
        Collections.sort(res);
        int q = sc.nextInt();
        while(q-->0){
            String s = sc.next();
            for(NhanVien x:res){
                if(x.getChucVu().equals(s))System.out.println(x);
            }
            System.out.println();
        }
    }
}
