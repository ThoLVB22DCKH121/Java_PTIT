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
class DoanhNghiep1 implements Comparable<DoanhNghiep1>{
    private String maDoanhNghiep, tenDoanhNghiep;
    private int soLuong;

    public DoanhNghiep1(String maDoanhNghiep, String tenDoanhNghiep, int soLuong) {
        this.maDoanhNghiep = maDoanhNghiep;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return maDoanhNghiep + " " + tenDoanhNghiep + " " + soLuong;
    }
    
    public int compareTo(DoanhNghiep1 d){
        if(this.soLuong==d.soLuong)return this.maDoanhNghiep.compareTo(d.maDoanhNghiep);
        else return Integer.compare(d.soLuong, this.soLuong);
    }

    public int getSoLuong() {
        return soLuong;
    }
    
}
public class J05029 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<DoanhNghiep1> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String mdn = sc.nextLine();
            String tdn = sc.nextLine();
            int sl = sc.nextInt();
            sc.nextLine();
            arr.add(new DoanhNghiep1(mdn,tdn,sl));
        }
        Collections.sort(arr);
        int q = sc.nextInt();
        while(q-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+Integer.toString(a)+" DEN "+Integer.toString(b)+" SINH VIEN:");
            for(DoanhNghiep1 x:arr){
                if(x.getSoLuong()>=a&&x.getSoLuong()<=b)System.out.println(x);
            }
        }
    }
}
