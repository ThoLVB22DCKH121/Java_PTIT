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
public class J07004 {
    public static void main(String[] args){
        int[] cnt = new int[10000];
        try{
            FileReader reader = new FileReader("DATA.in");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                String[] arr = line.split("\\s+");
                for(int i=0;i<arr.length;i++){
                    try{
                        cnt[Integer.parseInt(arr[i])]++;
                    }
                    catch(Exception e){
                    }
                }
            }
        }
        catch(Exception e){
        }
        for(int i=0;i<10000;i++){
            if(cnt[i]>0){
                System.out.println(i+" "+cnt[i]);
            }
        }
    }
}
