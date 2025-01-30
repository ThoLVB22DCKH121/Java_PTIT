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
class KhachHang1 implements Comparable<KhachHang1>{
    private String maKhachHang;
    private long heso, thanhtien,phutroi,tongtienphaitra;

    public KhachHang1(String maKhachHang, long heso, long thanhtien, long phutroi, long tongtienphaitra) {
        this.maKhachHang = maKhachHang;
        this.heso = heso;
        this.thanhtien = thanhtien;
        this.phutroi = phutroi;
        this.tongtienphaitra = tongtienphaitra;
    }

    @Override
    public String toString() {
        return maKhachHang + " " + heso + " " + thanhtien + " " + phutroi + " " + tongtienphaitra;
    }
    
    public int compareTo(KhachHang1 a){
        return Long.compare(a.tongtienphaitra, this.tongtienphaitra);
    }
    
}
public class J05051 {
    public static long tinhHeSo(String s){
        if(s.equals("KD"))return 3;
        else if(s.equals("NN"))return 5;
        else if(s.equals("TT"))return 4;
        else if(s.equals("CN"))return 2;
        else return 0;
    }
    
    public static long tinhThanhTien(long chisomoi, long chisocu,long heso){
        return (chisomoi-chisocu)*heso*550;
    }
    
    public static long tinhPhuTroi(long chisomoi, long chisocu, long heso){
        long tmp = chisomoi-chisocu;
        if(tmp>=50&&tmp<=100)return Math.round(tinhThanhTien(chisomoi,chisocu,heso)*35/100.0);
        else if(tmp>100)return tinhThanhTien(chisomoi,chisocu,heso);
        else return 0;
    }
    
    public static long tinhTongTienPhaiTra(long chisomoi, long chisocu, long heso){
        return tinhThanhTien(chisomoi,chisocu,heso)+tinhPhuTroi(chisomoi,chisocu,heso);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<KhachHang1> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String sd = sc.next();
            long chisocu = sc.nextLong();
            long chisomoi = sc.nextLong();
            arr.add(new KhachHang1("KH"+String.format("%02d",i+1),tinhHeSo(sd),tinhThanhTien(chisomoi,chisocu,tinhHeSo(sd)),tinhPhuTroi(chisomoi,chisocu,tinhHeSo(sd)),tinhTongTienPhaiTra(chisomoi,chisocu,tinhHeSo(sd))));
        }
        Collections.sort(arr);
        for(KhachHang1 i : arr)System.out.println(i);
    }
}
