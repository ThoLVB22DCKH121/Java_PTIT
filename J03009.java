/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class J03009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
           String s1 = sc.nextLine();
           String s2 = sc.nextLine();
           String[] arr1 = s1.split("\\s+");
           String[] arr2 = s2.split("\\s+");
           Arrays.sort(arr1);
           Map<String, Integer> map = new HashMap<>();
           for(String x:arr2){
               map.put(x, 1);
           }
           for(String x : arr1){
               if(!map.containsKey(x)){
                   System.out.print(x+" ");
                   map.put(x,1);
               }
           }
           System.out.println();
        }
    }
}
