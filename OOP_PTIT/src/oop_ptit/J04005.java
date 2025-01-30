/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.Scanner;
class Student{
    private String ten, ngaysinh;
    private float m1, m2, m3;
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setNgaysinh(String ngaysinh){
        this.ngaysinh = ngaysinh;
    }
    public void setM1(float m1){
        this.m1 = m1;
    }
    public void setM2(float m2){
        this.m2 = m2;
    }
    public void setM3(float m3){
        this.m3 = m3;
    }
    public String getTen(){
        return ten;
    }
    public String getNgaysinh(){
        return ngaysinh;
    }
    public double getM1(){
        return m1;
    }
    public double getM2(){
        return m2;
    }
    public double getM3(){
        return m3;
    }
}
public class J04005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student a = new Student();
        String x = sc.nextLine();
        a.setTen(x);
        String y = sc.next();
        a.setNgaysinh(y);
        float m1 = sc.nextFloat();
        a.setM1(m1);
        float m2 = sc.nextFloat();
        a.setM2(m2);
        float m3 = sc.nextFloat();
        a.setM3(m3);
        System.out.print(a.getTen() + " " + a.getNgaysinh() + " ");
        System.out.printf("%.1f", a.getM1()+a.getM2()+a.getM3());
    }
}
