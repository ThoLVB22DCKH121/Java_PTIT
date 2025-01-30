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
class HocSinh implements Comparable<HocSinh>{
    private String maHocSinh, tenHocSinh;
    private float diemTrungBinh;

    public HocSinh(String maHocSinh, String tenHocSinh, float diemTrungBinh) {
        this.maHocSinh = maHocSinh;
        this.tenHocSinh = tenHocSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return maHocSinh + " " + tenHocSinh + " " + String.format("%.1f", diemTrungBinh);
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }
    
    public int compareTo(HocSinh h){
        if(this.diemTrungBinh==h.diemTrungBinh)return this.maHocSinh.compareTo(h.maHocSinh);
        else return Float.compare(h.diemTrungBinh, this.diemTrungBinh);
    }
    
}
public class J05018 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<HocSinh> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String mhs = "000"+Integer.toString(i+1);
            String ths = sc.nextLine();
            float m1 = sc.nextFloat();
            float m2 = sc.nextFloat();
            float m3 = sc.nextFloat();
            float m4 = sc.nextFloat();
            float m5 = sc.nextFloat();
            float m6 = sc.nextFloat();
            float m7 = sc.nextFloat();
            float m8 = sc.nextFloat();
            float m9 = sc.nextFloat();
            float m10 = sc.nextFloat();
            sc.nextLine();
            arr.add(new HocSinh("HS"+mhs.substring(mhs.length()-2),ths, (float) (Math.round((m1*2+m2*2+m3+m4+m5+m6+m7+m8+m9+m10)/12*10.0)/10.0)));
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

