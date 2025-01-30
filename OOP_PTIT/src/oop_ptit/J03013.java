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
import java.math.BigInteger;

public class J03013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            if(num1.mod(num2).equals(BigInteger.ZERO)||num2.mod(num1).equals(BigInteger.ZERO))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
