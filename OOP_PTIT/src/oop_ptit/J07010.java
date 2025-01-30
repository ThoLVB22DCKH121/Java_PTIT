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

class Sinhvien{
    private String Msv,Ten,Lop,Ngaysinh;
    private float Gpa;
    public void setMsv(String Msv){
        this.Msv = Msv;
    }
    public String getMsv(){
        return Msv;
    }
    public void setTen(String Ten){
        this.Ten = Ten;
    }
    public String getTen(){
        return Ten;
    }
    public void setLop(String Lop){
        this.Lop = Lop;
    }
    public String getLop(){
        return Lop;
    }
    public void setNgaysinh(String Ngaysinh){
        this.Ngaysinh = Ngaysinh;
    }
    public String getNgaysinh(){
        return Ngaysinh;
    }
    public void setGpa(float Gpa){
        this.Gpa = Gpa;
    }
    public float getGpa(){
        return Gpa;
    }
    public void Chuanhoa(){
        String tmp = getNgaysinh();
        String a = "";
        for(int i=0;i<tmp.length();i++){
            if(tmp.charAt(i)!='/'){
                a+=tmp.charAt(i);
            }
            else{
                if(a.length()%2==0){
                    System.out.print(a+"/");
                    a = "";
                }
                else{
                    System.out.print("0"+a+"/");
                    a = "";
                }
            }
        }
        System.out.print(a);
    }
    public void In(){
        System.out.print(getMsv()+" "+getTen()+" "+getLop()+" ");
        Chuanhoa();
        System.out.printf(" %.2f",getGpa());
        System.out.println();
    }
    public Sinhvien(String msv ,String tensv, String lop, String ngaysinh, float gpa){
        this.Gpa = gpa;
        this.Msv = msv;
        this.Ngaysinh = ngaysinh;
        this.Lop = lop;
        this.Ten = tensv;
    }
}
public class J07010 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String tmp = "000"+Integer.toString(i+1);
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String ngaysinh = sc.nextLine().trim();
            float gpa = Float.parseFloat(sc.nextLine().trim());
            a.add(new Sinhvien("B20DCCN"+tmp.substring(tmp.length()-3),ten,lop,ngaysinh,gpa));
        }
        for(Sinhvien x : a){
            x.In();
        }
    }
}
