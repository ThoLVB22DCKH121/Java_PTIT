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
class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String maDoanhNghiep, tenDoanhNghiep;
    private int soLuong;

    public DoanhNghiep(String maDoanhNghiep, String tenDoanhNghiep, int soLuong) {
        this.maDoanhNghiep = maDoanhNghiep;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return maDoanhNghiep + " " + tenDoanhNghiep + " " + soLuong;
    }
    
    public int compareTo(DoanhNghiep d){
        if(this.soLuong==d.soLuong)return this.maDoanhNghiep.compareTo(d.maDoanhNghiep);
        else return Integer.compare(d.soLuong, this.soLuong);
    }
}
public class J05028 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String mdn = sc.nextLine();
            String tdn = sc.nextLine();
            int sl = sc.nextInt();
            sc.nextLine();
            arr.add(new DoanhNghiep(mdn,tdn,sl));
        }
        Collections.sort(arr);
        for(DoanhNghiep x:arr)System.out.println(x);
    }
}
