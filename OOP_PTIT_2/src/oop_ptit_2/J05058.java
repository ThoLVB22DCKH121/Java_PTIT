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
class SinhVien57 implements Comparable<SinhVien57>{
    private String maSinhVien, tenSinhVien;
    private float uutien,tongdiem;

    public SinhVien57(String maSinhVien, String tenSinhVien, float tongdiem) {
        if(maSinhVien.substring(0,3).equals("KV1"))this.uutien = 0.5f;
        else if(maSinhVien.substring(0,3).equals("KV2"))this.uutien = 1.0f;
        else this.uutien = 2.5f;
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.tongdiem = tongdiem;
    }
     
    public String chuanhoa(float a){
        if(a%1==0)return Integer.toString((int)a);
        else return Float.toString(a);
    }
    @Override
    public String toString() {
        return maSinhVien + " " + tenSinhVien + " " + chuanhoa(uutien) + " " + chuanhoa(tongdiem+uutien);
    }

    public float getTongdiem() {
        return tongdiem;
    }

    public float getUutien() {
        return uutien;
    }
    
    public int compareTo(SinhVien57 other){
        if(this.tongdiem+this.uutien==other.uutien+other.tongdiem){
            return this.maSinhVien.compareTo(other.maSinhVien);
        }
        else return Float.compare(other.tongdiem+other.uutien, this.tongdiem+this.uutien);
    }
    
}
public class J05058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien57> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ma  = sc.nextLine();
            String ten = sc.nextLine();
            float m1 = sc.nextFloat();
            float m2 = sc.nextFloat();
            float m3 = sc.nextFloat();
            arr.add(new SinhVien57(ma,ten,m1*2+m2+m3));
        }
        Collections.sort(arr);
        for(SinhVien57 x:arr){
            if(x.getTongdiem()+x.getUutien()>=24)System.out.println(x+" TRUNG TUYEN");
            else System.out.println(x+" TRUOT");
        }
    }
}
