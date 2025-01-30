/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.io.*;

class ThiSinh{
    private String maThiSinh, tenThiSinh;
    private float diemUuTien, tongDiem;
    public ThiSinh(String maThiSinh,String tenThiSinh,float tongDiem,float diemUuTien){
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.tongDiem = tongDiem;
        this.diemUuTien = diemUuTien;
    }
    public float getTongDiem(){
        return tongDiem;
    }
    public String chuanhoaDiem(float a){
        if((int)a == a)return Integer.toString((int)a);
        else return Float.toString(a);
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
        return maThiSinh+" "+chuanhoaTen(tenThiSinh)+" "+chuanhoaDiem(diemUuTien)+" "+chuanhoaDiem(tongDiem);
    }
}
public class J04013 {
    public static float tinhDiemUuTien(String tmp){
        if(tmp.substring(0,3).equals("KV1"))return 0.5f;
        else if(tmp.substring(0,3).equals("KV2"))return 1.0f;
        else if(tmp.substring(0,3).equals("KV3"))return 2.5f;
        else return 0.0f;
    }
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        String maThiSinh = sc.nextLine().trim();
        String tenThiSinh = sc.nextLine().trim();
        float mon1 = sc.nextFloat();
        float mon2 = sc.nextFloat();
        float mon3 = sc.nextFloat();
        float diemUuTien = tinhDiemUuTien(maThiSinh);
        ThiSinh a = new ThiSinh(maThiSinh,tenThiSinh,mon1*2+mon2+mon3,diemUuTien);
        if(a.getTongDiem()+diemUuTien>=24)System.out.print(a+" TRUNG TUYEN");
        else System.out.print(a+" TRUOT");
    }
        
}
