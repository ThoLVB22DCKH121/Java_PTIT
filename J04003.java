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
import java.lang.Math;
class Phanso{
    private long tu,mau;
    public long gcd(long a, long b){
        while(a*b!=0){
            if(a>b)a%=b;
            else b%=a;
        }
        return a+b;
    }
    public void setTu(long tu){
        this.tu = tu;
    }
    public void setMau(long mau){
        this.mau = mau;
    }
    public long getTu(){
        return tu;
    }
    public long getMau(){
        return mau;
    }
}
public class J04003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Phanso a = new Phanso();
        a.setTu(sc.nextLong());
        a.setMau(sc.nextLong());
        long tmp = a.gcd(a.getTu(), a.getMau());
        System.out.print(a.getTu()/tmp + "/" +a.getMau()/tmp);
    }
}
