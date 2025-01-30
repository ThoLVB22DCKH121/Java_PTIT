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

public class J01004 {
    public static boolean prime(int n){
        if(n==2||n==3)return true;
        if(n<2)return false;
        if(n%2==0||n%3==0)return false;
        int i = 5;
        while(i*i<=n){
            if(n%i==0||n%(i+2)==0)return false;
            i+=6;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- > 0){
            int n = scanner.nextInt();
            if(prime(n))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
