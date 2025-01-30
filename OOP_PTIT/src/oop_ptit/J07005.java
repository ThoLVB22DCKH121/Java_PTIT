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
public class J07005 {
    public static void main(String[] args)throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("DATA.IN");
        DataInputStream dis = new DataInputStream(fis);
        int[] cnt = new int[100001];
        //File có 100000 số nguyên dương nên sẽ đọc 100000 lần
        for(int i=0;i<100000;i++){
            cnt[dis.readInt()]++;
        }
        for(int i=0;i<1000;i++){
            if(cnt[i]>0)System.out.println(i+" "+cnt[i]);
        }
        dis.close();
    }
}