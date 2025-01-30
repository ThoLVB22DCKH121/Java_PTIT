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

public class J01009 {
    public static long giaithua(int n){
        if(n==1||n==0)return 1;
        else return n*giaithua(n-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum += giaithua(i);
        }
        System.out.print(sum);
    }
}
