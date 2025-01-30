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
import java.math.*;
class HocSinh implements Comparable<HocSinh>{
    private String maHocSinh, tenHocSinh;
    private double diemTrungBinh;

    public HocSinh(String maHocSinh, String tenHocSinh, double diemTrungBinh) {
        this.maHocSinh = maHocSinh;
        this.tenHocSinh = tenHocSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return maHocSinh + " " + tenHocSinh + " " + diemTrungBinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
    
    public int compareTo(HocSinh h){
        if(Double.compare(h.diemTrungBinh, this.diemTrungBinh)==0)return this.maHocSinh.compareTo(h.maHocSinh);
        else return Double.compare(h.diemTrungBinh, this.diemTrungBinh);
    }
    
}
public class J05018 {
    public static void main(String[] agrs){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<HocSinh> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ths = sc.nextLine();
            double x = 0;
            for(int j=0;j<10;j++){
                if(j<=1){
                    x+=sc.nextDouble()*2;
                }
                else x+=sc.nextDouble();
            }
            sc.nextLine();
            arr.add(new HocSinh("HS"+String.format("%02d", i+1),ths,Math.round(x/12*10)/10.0));
        }
        Collections.sort(arr);      
        for(HocSinh x:arr){
            if(x.getDiemTrungBinh()>=9){
                System.out.print(x);
                System.out.println(" XUAT SAC");
            }
            else if(x.getDiemTrungBinh()>=8){
                System.out.print(x);
                System.out.println(" GIOI");
            }
            else if(x.getDiemTrungBinh()>=7){
                System.out.print(x);
                System.out.println(" KHA");
            }
            else if(x.getDiemTrungBinh()>=5){
                System.out.print(x);
                System.out.println(" TB");
            }
            else {
                System.out.print(x);
                System.out.println(" YEU");
            }
        }
    }
}