/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.io.*;
class KhachHang{
    private String maKhachHang, tenKhachHang;
    private int tienTrongDinhMuc, tienVuotDinhMuc,tienVAT , tienNop;
    public int getTienNop(){
        return tienNop;
    }
    public String chuanhoaTen(){
        String tmp = "";
        String[] arr = tenKhachHang.split("\\s+");
        for(String x:arr){
            tmp += x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return tmp;
    }
    public String toString(){
        return maKhachHang+" "+chuanhoaTen()+Integer.toString(tienTrongDinhMuc)+" "+Integer.toString(tienVuotDinhMuc)+" "+Integer.toString(tienVAT)+" "+Integer.toString(tienNop);
    }
    public KhachHang(String maKhachHang,String tenKhachHang,int tienTrongDinhMuc,int tienVuotDinhMuc,int tienVAT,int tienNop){
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.tienTrongDinhMuc = tienTrongDinhMuc;
        this.tienVuotDinhMuc = tienVuotDinhMuc;
        this.tienNop = tienNop;
        this.tienVAT = tienVAT;
    }
}
public class J07056 {
    public static int tinhTienTrongDinhMuc(int chisoDau,int chisoCuoi,String loaiDinhMuc){
        int soDien = chisoCuoi - chisoDau;
        if(loaiDinhMuc.equals("A")&&soDien<=100)return soDien*450;
        else if(loaiDinhMuc.equals("A")&&soDien>100)return 100*450;
        else if(loaiDinhMuc.equals("B")&&soDien<=500)return soDien*450;
        else if(loaiDinhMuc.equals("B")&&soDien>500)return 500*450;
        else if(loaiDinhMuc.equals("C")&&soDien<=200)return soDien*450;
        else if(loaiDinhMuc.equals("C")&&soDien>200)return 200*450;
        else return 0;
    }
    public static int tinhTienVuotDinhMuc(int chisoDau,int chisoCuoi,String loaiDinhMuc){
        int soDien = chisoCuoi - chisoDau;
        if(loaiDinhMuc.equals("A")&&soDien>100)return (soDien-100)*1000;
        else if(loaiDinhMuc.equals("B")&&soDien>500)return (soDien-500)*1000;
        else if(loaiDinhMuc.equals("C")&&soDien>200)return (soDien-200)*1000;
        else return 0;
    }
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String tmp = "000" + Integer.toString(i+1);
            String tenKhachHang = sc.nextLine().trim();
            String dataEnergy = sc.nextLine().trim();
            String[] a = dataEnergy.split("\\s+");
            String loaiDinhMuc = a[0];
            int chisoDau = Integer.parseInt(a[1]);
            int chisoCuoi = Integer.parseInt(a[2]);
            int tienTrongDinhMuc = tinhTienTrongDinhMuc(chisoDau,chisoCuoi,loaiDinhMuc);
            int tienVuotDinhMuc = tinhTienVuotDinhMuc(chisoDau,chisoCuoi,loaiDinhMuc);
            arr.add(new KhachHang("KH"+tmp.substring(tmp.length()-2),tenKhachHang,tienTrongDinhMuc,tienVuotDinhMuc,tienVuotDinhMuc*5/100,tienTrongDinhMuc+tienVuotDinhMuc+tienVuotDinhMuc*5/100));
        }
        arr.sort((KH1,KH2)->KH2.getTienNop()-KH1.getTienNop());
        for(KhachHang x:arr){
            System.out.println(x);
        }
    }
}
