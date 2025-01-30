/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class J03020 {
    public static boolean checkThuanNghich(String s){
        int l = 0, r = s.length()-1;
        while(l<=r){
            if(s.charAt(r)!=s.charAt(l))return false;
            r--;
            l++;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,Integer> res = new LinkedHashMap<>();
        int maxlength = 0;
        while(sc.hasNext()){
            String line = sc.nextLine().trim();
            String[] arr = line.split("\\s+");
            for(String x:arr){
                if(checkThuanNghich(x)){
                    if(res.containsKey(x)){
                        res.put(x, res.get(x)+1);
                    }
                    else res.put(x,1);
                    maxlength = Math.max(maxlength, x.length());
                }
            }
        }
        Set<Map.Entry<String,Integer>> entrySet = res.entrySet();
        for(Map.Entry<String,Integer> entry:entrySet){
            if(entry.getKey().length() == maxlength){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
