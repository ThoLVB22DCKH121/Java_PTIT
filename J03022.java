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
public class J03022 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        ArrayList<String> res = new ArrayList<>();
        while(sc.hasNext()){
            String line = sc.nextLine().trim();
            try{
                String[] arr = line.split("[.!?]");
                for(String x:arr)if(!x.isEmpty())res.add(x.toLowerCase());
            }
            catch(Exception e){
                
            }
        }
        for(String x:res){
            String[] arr = x.trim().split("\\s+");
            System.out.print(arr[0].substring(0,1).toUpperCase()+arr[0].substring(1)+" ");
            for(int i=1;i<arr.length;i++)System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}
