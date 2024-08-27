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

public class J01021 {
    public static long luythua(long a,long b){
        long tmp=1;
        while(b>0){
            if(b%2!=0)tmp=(tmp*a)%1000000007;
            a=(a*a)%1000000007;
            b/=2;
        }
        return tmp;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if(a==0&&b==0)break;
            System.out.println(luythua(a,b));
        }
    }
}
