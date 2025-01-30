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
import java.math.*;
public class J03014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        BigInteger num3 = num1.add(num2);
        String tmp = num3.toString();
        for(int i=0;i<Math.max(num1.toString().length(), num2.toString().length())-tmp.length();i++){
            System.out.print("0");
        }
        System.out.println(tmp);
    }
}
