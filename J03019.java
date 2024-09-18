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

public class J03019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String tmp = "";
        tmp += s.charAt(s.length()-1);
        for(int i=s.length()-2;i>=0;i--){
            if(s.charAt(i)>=tmp.charAt(tmp.length()-1))tmp += s.charAt(i);
        }
        for(int i=tmp.length()-1;i>=0;i--)System.out.print(tmp.charAt(i));
    }
}
