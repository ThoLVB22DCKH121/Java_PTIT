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
        
public class J01008 {
    public static void prime(int n){
        int i = 2;
        while(i*i<=n){
            int cnt = 0;
            while(n%i==0){
                cnt+=1;
                n/=i;
            }
            if(cnt>0){
                System.out.print(i+"("+cnt+")"+" ");
            }
            i+=1;
        }
        if(n!=1)System.out.print(n+"("+"1"+")"+" ");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int pos = 0;
        while(test-- > 0){
            int n = scanner.nextInt();
            System.out.print("Test "+(pos+=1)+": ");
            prime(n);
            System.out.println();
        }
    }
}
