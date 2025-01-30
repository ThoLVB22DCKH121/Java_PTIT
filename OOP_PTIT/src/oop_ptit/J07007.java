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

public class J07007 {
    public static void main(String[] args){
        TreeSet<String> set = new TreeSet<>();
        try{
           FileReader reader = new FileReader("VANBAN.in");
           BufferedReader bufferedReader = new BufferedReader(reader);
           String line;
           while((line = bufferedReader.readLine())!=null){
               String[] arr = line.split("\\s+");
               for(String x:arr){
                   try{
                       if(!x.equals(""))set.add(x.toLowerCase());
                   }
                   catch(Exception e){
                   }
               }
           }
        }
        catch(Exception e){
        }
        for(String x : set){
            System.out.println(x);
        }
    }
}
