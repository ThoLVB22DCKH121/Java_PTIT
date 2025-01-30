/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
class SinhVien{
    private String lopSinhVien, tenSinhVien, maSinhVien, ngaySinh;
    private float gpa;
    
    public SinhVien(String maSinhVien,String tenSinhVien,String lopSinhVien,String ngaySinh,float gpa){
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.lopSinhVien = lopSinhVien;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    
    public String chuanhoa1(){
        String tmp = "";
        String[] arr = ngaySinh.trim().split("/");
        for(String x:arr){
            if(x.length()%2!=0){
                tmp += "0"+ x + "/";
            }
            else tmp += x + "/";
        }
        return tmp.substring(0,tmp.length()-1);
    }
    
    public String chuanhoa2(){
        String[] arr = tenSinhVien.trim().split("\\s+");
        String tmp = "";
        for(String x:arr){
            tmp += x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return tmp.trim();
    }
    
    public String toString(){
        return maSinhVien+" "+chuanhoa2()+" "+lopSinhVien+" "+chuanhoa1()+" "+String.format("%.2f", gpa);
    }
}
public class J05004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String msv = "0000"+Integer.toString(i+1);
            String tsv = sc.nextLine();
            String lsv = sc.nextLine();
            String ns = sc.nextLine();
            float gpa = sc.nextFloat();
            sc.nextLine();
            arr.add(new SinhVien("B20DCCN"+msv.substring(msv.length()-3,msv.length()),tsv,lsv,ns,gpa));
        }
        for(SinhVien x:arr){
            System.out.println(x);
        }
    }
}
