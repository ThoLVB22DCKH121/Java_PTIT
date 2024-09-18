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
class MonHoc{
    private String maMon, tenMon, hinhthucThi;
    public String getMaMon(){
        return maMon;
    }
    public MonHoc(String maMon,String tenMon,String hinhthucThi){
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhthucThi = hinhthucThi;
    }
    public String toString(){
        return maMon+" "+tenMon+" "+hinhthucThi;
    }
}
public class J07058 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<MonHoc> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String maMon = sc.nextLine().trim();
            String tenMon = sc.nextLine().trim();
            String hinhthucThi = sc.nextLine().trim();
            arr.add(new MonHoc(maMon,tenMon,hinhthucThi));
        }
        arr.sort((m1,m2)->m1.getMaMon().compareTo(m2.getMaMon()));
        for(MonHoc x:arr)System.out.println(x);
    }
}
