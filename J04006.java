/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 */
import java.util.Scanner;

class Sinhvien{
    private String msv="B20DCCN001",ten,lop,ngaysinh;
    private float gpa;
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getTen(){
        return ten;
    }
    public void setNgaysinh(String ngaysinh){
        this.ngaysinh = ngaysinh;
    }
    public String getNgaysinh(){
        return ngaysinh;
    }
    public void setLop(String lop){
        this.lop = lop;
    }
    public String getLop(){
        return lop;
    }
    public void setGpa(float gpa){
        this.gpa = gpa;
    }
    public float getGpa(){
        return gpa;
    }
    public String getMsv(){
        return msv;
    }
}

public class J04006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sinhvien a = new Sinhvien();
        a.setTen(sc.nextLine());
        a.setLop(sc.next());
        a.setNgaysinh(sc.next());
        a.setGpa(sc.nextFloat());
        String tmp = a.getNgaysinh();
        String s = "";
        System.out.print(a.getMsv()+" "+a.getTen()+" "+a.getLop()+" ");
        for(int i=0;i<tmp.length();i++){
            if(tmp.charAt(i)=='/'){
                if(s.length()%2!=0)System.out.print("0"+s+"/");
                else System.out.print(s+"/");
                s = "";
            }
            else s+=tmp.charAt(i);
        }
        System.out.print(tmp.substring(tmp.length()-4,tmp.length()));
        System.out.printf(" %.2f", a.getGpa());
    } 
}
