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

public class J07021 {
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("DATA.in");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                if(line.equals("END"))break;
                String[] arr = line.trim().split("\\s+");
                for(String x:arr){
                    System.out.print(x.substring(0, 1).toUpperCase()+x.substring(1).toLowerCase()+" ");
                }
                System.out.println();
            }
        }
        catch(Exception e){
            
        }
    }
}
