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

public class J07002 {
    public static void main(String[] args){
        long sum = 0;
        try{
            FileReader reader = new FileReader("DATA.in");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                String[] arr = line.split("\\s+");
                for(int i=0;i<arr.length;i++){
                    try{
                        sum += Integer.parseInt(arr[i]);
                    }
                    catch(Exception e){
                    }
                }
            
            }
        }
        catch(Exception e){
        }
        System.out.println(sum);
    }
}
