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

public class J02004 {
    public static boolean doixung(int[] a){
        int r = a.length-1;
        int l = 0;
        while(l<r){
            if(a[r]!=a[l])return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- >0){
            int n = scanner.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = scanner.nextInt();
            }
            if(doixung(a))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
