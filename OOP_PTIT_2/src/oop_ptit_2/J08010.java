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
public class J08010 {
    public static boolean check(String s){
        int l = 0, r = s.length()-1;
        while(l<=r){
            if(s.charAt(r)!=s.charAt(l)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int maxw = 0;
        Map<String,Long> mp = new HashMap<>();
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] list = line.trim().split("\\s+");
            for(String x:list){
                if(check(x)){
                    maxw = Math.max(maxw, x.length());
                    if(!mp.containsKey(x)){
                        mp.put(x, 1l);
                        arr.add(x);
                    }
                    else{
                        mp.put(x,mp.get(x)+1);
                    }
                }
            }
        }
        for(String x:arr){
            if(x.length()==maxw){
                System.out.println(x+" "+mp.get(x));
            }
        }
    }
}
/*
AAA BAABA HDHDH ACBSD SRGTDH DDDDS
DUAHD AAA AD DA HDHDH AAA AAA AAA AAA
DDDAS HDHDH HDH AAA AAA AAA AAA AAA
AAA AAA AAA
DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
TDTD
*/