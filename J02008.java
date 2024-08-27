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

public class J02008 {
    public static long lcm(long a,long b){
        long n = a, m = b;
        while(a*b!=0){
            if(a>b)a%=b;
            else b%=a;
        }
        return (n*m)/(a+b);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- >0){
            long n = scanner.nextLong();
            long Lcm = 1;
            for(int i=2;i<=n;i++){
                Lcm = lcm(Lcm,i);
            }
            System.out.println(Lcm);
        }
    }
}
