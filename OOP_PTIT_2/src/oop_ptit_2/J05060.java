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
class PH {
    private String maPH, tenPH;
    private float dtb;
    private int nsPH;

    public PH(String maPH, String tenPH, int nsPH, float dtb) {
        this.maPH = maPH;
        this.tenPH = tenPH;
        this.nsPH = nsPH;
        this.dtb = dtb;
    }

    @Override
    public String toString() {
        return maPH + " " + tenPH + " " + nsPH + " " + Math.round(dtb);
    }

    public float getDtb() {
        return dtb;
    }
    
}
public class J05060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<PH> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ma = String.format("PH%02d", i+1);
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            float lt = sc.nextFloat();
            float th = sc.nextFloat();
            float dtb = 0;
            if(lt>=8&&th>=8)dtb = (lt+th)/2+1;
            else if(lt>=7.5&&th>=7.5)dtb = (float) ((lt+th)/2+0.5);
            else dtb = (lt+th)/2;
            dtb = Math.min(10, dtb);
            arr.add(new PH(ma,ten,2021-Integer.parseInt(ns.substring(6)),dtb));
        }
        for(PH x:arr){
            String tmp = "";
            if(Math.round(x.getDtb())>=9)tmp = "Xuat sac";
            else if(Math.round(x.getDtb())==8)tmp = "Gioi";
            else if(Math.round(x.getDtb())==7)tmp = "Kha";
            else if(Math.round(x.getDtb())>=5)tmp = "Trung binh";
            else tmp = "Truot";
            System.out.println(x+" "+tmp);
        }
    }
}

/*
3
Doan Thi Kim
13/03/1982
8
9,5
Dinh Thi Ngoc Ha
03/09/1996
6,5
8
Tran Thanh Mai
12/09/2004
8
9
*/