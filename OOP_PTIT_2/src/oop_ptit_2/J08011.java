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
import java.io.*;
public class J08011 {
    public static boolean check(String x){
        for(int i=0;i<x.length()-1;i++){
            if(x.charAt(i)>x.charAt(i+1))return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Map<Long,Long> mp = new HashMap<>();
        ArrayList<Long> arr = new ArrayList<>();
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] s = line.trim().split("\\s+");
            try{
                for(String x:s){
                    if(!check(x))continue;
                    long tmp = Long.parseLong(x);
                    if(mp.containsKey(tmp)){
                        mp.put(tmp, mp.get(tmp)+1);
                    }
                    else{
                        arr.add(tmp);
                        mp.put(tmp, 1l);
                    }
                }
            }
            catch (Exception e){
                
            }
        }
        arr.sort((s1,s2)->Long.compare(mp.get(s2), mp.get(s1)));
        for(Long x:arr){
            System.out.println(x+" "+mp.get(x));
        }
    }
}
