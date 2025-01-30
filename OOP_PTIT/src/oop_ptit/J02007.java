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

public class J02007 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int pos = 0;
        while(test-- >0){
            int n = scanner.nextInt();
            int[] cnt = new int[100001];
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = scanner.nextInt();
                cnt[a[i]]++;
            }
            System.out.println("Test " + (pos+=1) + ":");
            for(int i=0;i<n;i++){
                if(cnt[a[i]]>0){
                    System.out.println(a[i] + " xuat hien " + cnt[a[i]] + " lan");
                    cnt[a[i]]=0;
                }
            }
        }
    }
}
