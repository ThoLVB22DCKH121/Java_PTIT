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
import java.math.*;

public class J07003 {
    public static void main(String[] args)throws FileNotFoundException{
        File reader = new File("DATA.in");
        Scanner sc = new Scanner(reader);
        sc.hasNext();
        String s = sc.next();
        try{
            while(s.length()!=1){
                String s1,s2;
                if(s.length()%2==0){
                    s1 = s.substring(0,s.length()/2);
                    s2 = s.substring(s.length()/2);
                }
                else {
                    s1 = s.substring(0,s.length()/2);
                    s2 = s.substring(s.length()/2);
                }
                BigInteger num1 = new BigInteger(s1);
                BigInteger num2 = new BigInteger(s2);
                s = "";
                s = num1.add(num2).toString();
                System.out.println(s);
            }
        }
        catch(Exception e){ 
        }
    }
}
