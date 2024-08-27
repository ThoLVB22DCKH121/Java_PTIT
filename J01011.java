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
public class J01011 {
    public static long gcd(long a, long b){
        while(a*b!=0){
            if(a>b)a%=b;
            else b%=a;
        }
        return a+b;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- > 0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.print((long)(a*b)/gcd(a,b)+" ");
            System.out.println(gcd(a,b));
        }
    }
}
