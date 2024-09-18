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
class ThiSinh{
    private String tenThiSinh, maThiSinh;
    private int birthThiSinh,diemTrungBinh;
    public ThiSinh(String maThiSinh,String tenThiSinh,int birthThiSinh,int diemTrungBinh){
        this.tenThiSinh = tenThiSinh;
        this.birthThiSinh = birthThiSinh;
        this.diemTrungBinh = diemTrungBinh;
        this.maThiSinh = maThiSinh;
    }
    public int getDiemTrungBinh(){
        return diemTrungBinh;
    }
    public String chuanhoaTen(String tmp){
        String s = "";
        String[] arr = tmp.split("\\s+");
        for(String x : arr){
            s += x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return s;
    }
    public String toString(){
        return maThiSinh+" "+chuanhoaTen(tenThiSinh)+birthThiSinh+" ";
    }
}
public class J07053 {
    public static float tinhDiemTrungBinh(float lythuyet,float thuchanh){
        float tmp = (float)(lythuyet+thuchanh)/2;
        if(lythuyet>=8&&thuchanh>=8)tmp+=1;
        else if(lythuyet>=7.5&&thuchanh>=7.5)tmp+=0.5;
        return tmp;
    }
    public static int tinhTuoi(String ngaysinh){
        return 2021-Integer.parseInt(ngaysinh.substring(ngaysinh.length()-4));
    }
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<ThiSinh> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String maThiSinh = "000" + Integer.toString(i+1);
            String tenThiSinh = sc.nextLine().trim();
            String ngaysinh = sc.nextLine().trim();
            float diemLyThuyet = Float.parseFloat(sc.nextLine().trim());
            float diemThucHanh = Float.parseFloat(sc.nextLine().trim());
            int tuoi = tinhTuoi(ngaysinh);
            //Làm tròn số đến hàng đơn vị hàng hàm Math.round()
            int diemTrungBinh = Math.round(tinhDiemTrungBinh(diemLyThuyet,diemThucHanh));
            a.add(new ThiSinh("PH"+maThiSinh.substring(maThiSinh.length()-2),tenThiSinh,tuoi,diemTrungBinh));
        }
        for(ThiSinh x:a){
            System.out.print(x);
            if(x.getDiemTrungBinh()>10)System.out.println("10"+" Xuat sac");
            else if(x.getDiemTrungBinh()>=9)System.out.println(x.getDiemTrungBinh()+" Xuat sac");
            else if(x.getDiemTrungBinh()>=8)System.out.println(x.getDiemTrungBinh()+" Gioi");
            else if(x.getDiemTrungBinh()>=7)System.out.println(x.getDiemTrungBinh()+" Kha");
            else if(x.getDiemTrungBinh()>=5)System.out.println(x.getDiemTrungBinh()+" Trung binh");
            else System.out.println(x.getDiemTrungBinh()+" Truot");
        }
    }
}
