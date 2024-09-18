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
import java.time.*;
import java.time.format.*;
class CaThi implements Comparable<CaThi>{
    private String maCaThi, ngayCaThi, gioCaThi, phongCaThi;
    public CaThi(String maCaThi,String ngayCaThi,String gioCaThi,String phongCaThi){
        this.maCaThi = maCaThi;
        this.ngayCaThi = ngayCaThi;
        this.gioCaThi = gioCaThi;
        this.phongCaThi = phongCaThi;
    }
    public String toString(){
        return maCaThi+" "+ngayCaThi+" "+gioCaThi+" "+phongCaThi;
    }
    public int compareTo(CaThi a){
        String datetimeString1 = this.ngayCaThi+" "+this.gioCaThi;
        String datetimeString2 = a.ngayCaThi+" "+a.gioCaThi;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dateTime1 = LocalDateTime.parse(datetimeString1,formatter);
        LocalDateTime dateTime2 = LocalDateTime.parse(datetimeString2,formatter);
        if (dateTime1.isBefore(dateTime2)) {
            return -1;
            //time1 xảy ra trước time2 thì trả về true nhưng điều kiện này trả về false nên thứ tự giữ nguyên
        } else if (dateTime1.isAfter(dateTime2)) {
            return 1;
        } else {
            return this.maCaThi.compareTo(a.maCaThi);
        }
    }
}
public class J07059 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<CaThi> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String tmp = "000" + Integer.toString(i+1);
            String ngayCaThi = sc.nextLine().trim();
            String gioCaThi = sc.nextLine().trim();
            String phongCaThi = sc.nextLine().trim();
            arr.add(new CaThi("C"+tmp.substring(tmp.length()-3),ngayCaThi,gioCaThi,phongCaThi));
        }
        Collections.sort(arr);
        for(CaThi x:arr)System.out.println(x);
    }
}
