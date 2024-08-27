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
class Phanso{
    private long tu,mau;
    public void setTu(long tu){
        this.tu = tu;
    }
    public long getTu(){
        return tu;
    }
    public void setMau(long mau){
        this.mau = mau;
    }
    public long getMau(){
        return mau;
    }
}
public class J04004 {
    public static long gcd(long a, long b){
        while(a*b!=0){
            if(a>b)a%=b;
            else b%=a;
        }
        return a+b;
    }
    public static void Tongphanso(Phanso a, Phanso b){
        long tu = (long)a.getTu()*b.getMau()+(long)a.getMau()*b.getTu();
        long mau = (long)a.getMau()*b.getMau();
        long tmp = gcd(tu,mau);
        System.out.print(tu/tmp +"/"+mau/tmp);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Phanso a = new Phanso();
        Phanso b = new Phanso();
        a.setTu(sc.nextLong());
        a.setMau(sc.nextLong());
        b.setTu(sc.nextLong());
        b.setMau(sc.nextLong());
        Tongphanso(a,b);
    }
}
