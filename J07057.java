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
class ThiSinh implements Comparable<ThiSinh>{
    private String maThiSinh, tenThiSinh, xetTuyen;
    private float diemTong;
    public int compareTo(ThiSinh a){
        if(a.diemTong==this.diemTong)return this.maThiSinh.compareTo(a.maThiSinh);
        else return Float.compare(a.diemTong, this.diemTong);
    }
    public ThiSinh(String maThiSinh,String tenThiSinh,float diemTong,String xetTuyen){
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.diemTong = diemTong;
        this.xetTuyen = xetTuyen;
    }
    public String chuanhoaTen(){
        String tmp="";
        String[] arr = tenThiSinh.split("\\s+");
        for(String x:arr){
            tmp += x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return tmp;
    }
    public String toString(){
        return maThiSinh+" "+chuanhoaTen()+String.format("%.1f", diemTong)+" "+xetTuyen;
    }
}
public class J07057 {
    public static float tinhDiemTong(int khuvuc,String dantoc,float diemGoc){
        if(khuvuc == 1)diemGoc += 1.5;
        if(khuvuc == 2)diemGoc += 1;
        if(!dantoc.equals("Kinh"))diemGoc += 1.5;
        return diemGoc;
    }
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String tmp = "000" + Integer.toString(i+1);
            String tenThiSinh = sc.nextLine().trim();
            float diemGoc = Float.parseFloat(sc.nextLine().trim());
            String dantoc = sc.nextLine().trim();
            int khuvuc = Integer.parseInt(sc.nextLine().trim());
            float diemTong = tinhDiemTong(khuvuc,dantoc,diemGoc);
            if(diemTong >= 20.5){
                arr.add(new ThiSinh("TS"+tmp.substring(tmp.length()-2),tenThiSinh,diemTong,"Do"));
            }
            else arr.add(new ThiSinh("TS"+tmp.substring(tmp.length()-2),tenThiSinh,diemTong,"Truot"));
        }
        Collections.sort(arr);
        for(ThiSinh x:arr){
            System.out.println(x);
        }
    }
}
