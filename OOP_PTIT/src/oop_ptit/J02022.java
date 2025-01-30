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
import java.lang.Math;

public class J02022 {
    static int[] a = new int[100];
    static boolean[] check = new boolean[100];
    static int n;
    public static boolean xet(int[] n){
        for(int i=0;i<n.length-1;i++){
            if(Math.abs(n[i]-n[i+1])==1)return false;
        }
        return true;
    }
    public static void Try(int i){
        for(int j=1;j<=n;j++){
            if(i>1&&Math.abs(j-a[i-1])==1)continue;
            if(check[j]){
                a[i] = j;
                check[j] = false;
                if(i==n){
                    for(int it=1;it<=n;it++){
                        System.out.print(a[it]);
                    }
                    System.out.println();
                }
                else Try(i+1);
                check[j] = true;
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- >0){
            n = scanner.nextInt();
            for(int i=1;i<=n;i++)check[i] = true;
            Try(1);
        }
    }
}
