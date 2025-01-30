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
import java.io.*;
import java.time.format.*;
import java.time.*;
class KhachHang implements Comparable<KhachHang>{
    private String maKhachHang, tenKhachHang, gioiTinh, ngaySinh, diaChi;

    public KhachHang(String maKhachHang, String tenKhachHang, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
    public String chuanhoa1(String s){
        String[] arr = s.trim().split("/");
        String tmp = "";
        for(String x:arr){
            if(x.length()%2!=0){
                tmp += "0" + x + "/";
            }
            else tmp += x + "/";
        }
        return tmp.substring(0, tmp.length()-1);
    }

    public String chuanhoa2(){
        String[] arr = tenKhachHang.trim().split("\\s+");
        String tmp = "";
        for(String x:arr){
            tmp += x.substring(0, 1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return tmp.trim();
    }

    @Override
    public String toString() {
        return maKhachHang + " " + chuanhoa2() + " " + gioiTinh + " " + diaChi + " " + chuanhoa1(ngaySinh);
    }
    public int compareTo(KhachHang k){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate time1 = LocalDate.parse(chuanhoa1(this.ngaySinh), formatter);
        LocalDate time2 = LocalDate.parse(chuanhoa1(k.ngaySinh), formatter);
        return time1.compareTo(time2);
    }
    
}
public class J07025 {
    public static void main(String[] args)throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String mkh = "0000"+Integer.toString(i+1);
            String tkh = sc.nextLine().trim();
            String gt = sc.nextLine().trim();
            String ns = sc.nextLine().trim();
            String dc = sc.nextLine().trim();
            arr.add(new KhachHang("KH"+mkh.substring(mkh.length()-3),tkh,gt,ns,dc));
        }
        Collections.sort(arr);
        for(KhachHang x:arr)System.out.println(x);
    }
}