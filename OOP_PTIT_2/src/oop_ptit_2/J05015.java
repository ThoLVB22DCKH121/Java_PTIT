/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit_2;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.math.*;

class CuaRo implements Comparable<CuaRo>{
    private String maCr="",tenCr,donviCr,gio,phut;
    private float vanToc;

    public CuaRo(String tenCr, String donviCr, float vanToc,String gio, String phut) {
        String[] arr1 = donviCr.trim().split("\\s+");
        String[] arr2 = tenCr.trim().split("\\s+");
        for(String i:arr1)this.maCr+=i.substring(0, 1);
        for(String i:arr2)this.maCr+=i.substring(0, 1);
        this.tenCr = tenCr;
        this.donviCr = donviCr;
        this.vanToc = vanToc;
        this.gio = gio;
        this.phut = phut;
    }

    @Override
    public String toString() {
        return maCr + " " + tenCr + " " + donviCr + " " + (int) Math.round(vanToc) + " Km/h";
    }
    
    public int compareTo(CuaRo other){
        if(this.gio.equals(other.gio))return Integer.compare(Integer.parseInt(this.phut), Integer.parseInt(other.phut));
        else return Integer.compare(Integer.parseInt(this.gio), Integer.parseInt(other.gio));
    }
}
public class J05015 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<CuaRo> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten = sc.nextLine();
            String tinh = sc.nextLine();
            String gio = sc.nextLine();
            String[] time = gio.trim().split(":");
            arr.add(new CuaRo(ten,tinh,Math.round(120.0/(Integer.parseInt(time[0])-6+Integer.parseInt(time[1])/60.0)),time[0],time[1]));
        }
        Collections.sort(arr);
        for(CuaRo x:arr){
            System.out.println(x);
        }
    }
}
