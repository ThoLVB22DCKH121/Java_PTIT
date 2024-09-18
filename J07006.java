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
public class J07006 {
    public static void main(String[] args)throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>)ois.readObject();
        int[] cnt = new int[10001];
        for(Integer i:arr){
            cnt[i]++;
        }
        for(int i=0;i<1001;i++){
            if(cnt[i]>0)System.out.println(i+" "+cnt[i]);
        }
    }
}
