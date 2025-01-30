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
class Monhoc{
    private String Mamon, Tenmon;
    private int Sotinchi;
    public void setMamon(String Mamon){
        this.Mamon = Mamon;
    }
    public String getMamon(){
        return Mamon;
    }
    public void setTenmon(String Tenmon){
        this.Tenmon = Tenmon;
    }
    public String getTenmon(){
        return Tenmon;
    }
    public void setSotinchi(int Sotinchi){
        this.Sotinchi = Sotinchi;
    }
    public int getSotinchi(){
        return Sotinchi;
    }
}
public class J07034 {
    public static void main(String[] args){
        int n = 0;
        Monhoc[] a = new Monhoc[1000001];
        try{
            FileReader reader = new FileReader("C:\\Users\\LE VAN THO\\Documents\\NetBeansProjects\\OOP_PTIT\\src\\oop_ptit\\DATA.in");
            BufferedReader bufferedReader = new BufferedReader(reader);
            n = Integer.parseInt(bufferedReader.readLine());
            for(int i=0;i<n;i++){
                a[i] = new Monhoc();
                a[i].setMamon(bufferedReader.readLine());
                a[i].setTenmon(bufferedReader.readLine());
                a[i].setSotinchi(Integer.parseInt(bufferedReader.readLine()));
            }
        }
        catch(Exception e){
            
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].getTenmon().compareTo(a[j].getTenmon())>0){
                    Monhoc tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i].getMamon()+" "+a[i].getTenmon()+" "+a[i].getSotinchi());
        }
    }
}
