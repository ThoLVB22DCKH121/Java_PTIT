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

public class J01014 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- >0){
            long n = scanner.nextLong();
            int i;
            for(i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    while(n%i==0){
                        n/=i;
                    }
                }
            }
            if(n!=1)System.out.println(n);
            else System.out.println(i-1);
        }
    }
}
