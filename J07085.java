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
public class J07085 {
    public static void main(String[] args)throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\LE VAN THO\\Documents\\NetBeansProjects\\OOP_PTIT\\src\\oop_ptit\\DATA.in"));
        ArrayList<String> arr = (ArrayList<String>)ois.readObject();
        for(String i:arr){
            String tmp = "";
            int sum = 0;
            for(int j=0;j<i.length();j++){
                if(i.charAt(j)>='0'&&i.charAt(j)<='9'){
                    tmp += i.charAt(j);
                    sum += i.charAt(j)-'0';
                }
            }
            if(!tmp.isEmpty())System.out.println(Integer.parseInt(tmp)+" "+sum);
        }
    }
}
