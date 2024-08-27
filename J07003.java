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
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.io.IOException;

public class J07003 {
    public static void main(String[] args){
        try{
            FileReader fileReader = new FileReader("C:\\Users\\LE VAN THO\\Documents\\NetBeansProjects\\OOP_PTIT\\src\\oop_ptit\\DATA.in");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s;
            if((s = bufferedReader.readLine())!=null){
                while(s.length()!=1){
                    String s1,s2;
                    if(s.length()%2==0){
                        s1 = s.substring(0,s.length()/2);
                        s2 = s.substring(s.length()/2);
                    }
                    else {
                        s1 = s.substring(0,s.length()/2+1);
                        s2 = s.substring(s.length()/2+1);
                    }
                    BigInteger num1 = new BigInteger(s1);
                    BigInteger num2 = new BigInteger(s2);
                    s = "";
                    s = num1.add(num2).toString();
                }
            System.out.println(s);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
