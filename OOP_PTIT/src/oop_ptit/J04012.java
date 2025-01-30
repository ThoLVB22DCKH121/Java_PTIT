/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
public class J04012 {
    public static int tinhThuong(int snc,int lcb){
        if(snc>=25)return snc*lcb*20/100;
        else if(snc>=22)return snc*lcb*10/100;
        else return 0;
    }
    public static int tinhPhuCap(String cv){
        if(cv.equals("GD"))return 250000;  
        else if(cv.equals("PGD"))return 200000; 
        else if(cv.equals("TP"))return 180000;
        else return 150000;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine().trim();
        int lcb = sc.nextInt();
        int snc = sc.nextInt();
        sc.nextLine();
        String cv = sc.nextLine().trim();
        System.out.print("NV01"+" "+ten+" "+Integer.toString(lcb*snc)+" "+Integer.toString(tinhThuong(snc,lcb))+" "+Integer.toString(tinhPhuCap(cv))+" "+Integer.toString(tinhPhuCap(cv)+tinhThuong(snc,lcb)+lcb*snc));
    }
}
