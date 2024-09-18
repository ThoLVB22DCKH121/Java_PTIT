/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 **/
import java.util.*;
import java.io.*;
class MonHoc{
    private String maMonHoc, tenMonHoc, hinhthucDay;
    private int soTinChi;
    public String getMaMonHoc(){
        return maMonHoc;
    }
    public String getHinhThucDay(){
        return hinhthucDay;
    }
    public MonHoc(String maMonHoc,String tenMonHoc,int soTinChi,String hinhthucDay){
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
        this.hinhthucDay = hinhthucDay;
    }
    public String toString(){
        return maMonHoc+" "+tenMonHoc+" "+Integer.toString(soTinChi)+" "+hinhthucDay;
    }
}
public class J07073 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<MonHoc> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String maMonHoc = sc.nextLine().trim();
            String tenMonHoc = sc.nextLine().trim();
            int soTinChi = Integer.parseInt(sc.nextLine().trim());
            String hinhthucDay = sc.nextLine().trim();
            hinhthucDay += " " + sc.nextLine().trim();
            arr.add(new MonHoc(maMonHoc,tenMonHoc,soTinChi,hinhthucDay));
        }
        arr.sort((m1,m2)->m1.getMaMonHoc().compareTo(m2.getMaMonHoc()));
        for(MonHoc x:arr){
            String s = x.getHinhThucDay().substring(x.getHinhThucDay().length()-9);
            if(!s.equals("Truc tiep"))System.out.println(x);
        }
    }
}
