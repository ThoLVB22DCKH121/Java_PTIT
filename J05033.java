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

class Time{
    private long gio, phut, giay;
    public void setGio(long gio){
        this.gio = gio;
    }
    public long getGio(){
        return gio;
    }
    public void setPhut(long phut){
        this.phut = phut;
    }
    public long getPhut(){
        return phut;
    }
    public void setGiay(long giay){
        this.giay = giay;
    }
    public long getGiay(){
        return giay;
    }
    public long TongTime(){
        return getGio()*3600+getPhut()*60+getGiay();
    }
}
public class J05033 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time[] a = new Time[n];
        for(int i=0;i<n;i++){
            a[i] = new Time();
            a[i].setGio(sc.nextLong());
            a[i].setPhut(sc.nextLong());
            a[i].setGiay(sc.nextLong());
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].TongTime()>a[j].TongTime()){
                    Time tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i].getGio()+" "+a[i].getPhut()+" "+a[i].getGiay());
        }
    }
}
