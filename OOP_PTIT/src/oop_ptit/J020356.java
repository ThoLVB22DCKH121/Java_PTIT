/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
public class J020356 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] minw = new int[n];
        int[] maxw = new int[n];
        int a = s-1, b = s;
        for(int i=n-1;i>=0;i--){
            while(minw[i]<9&&a>0){
                minw[i] += 1;
                a--;
            }
        }
        minw[0] += 1;
        for(int i=0;i<n;i++){
            while(maxw[i]<9&&b>0){
                maxw[i] += 1;
                b--;
            }
        }
        if(a>0||b>0||s == 0)System.out.print("-1 -1");
        else{
            for(int i=0;i<n;i++)System.out.print(minw[i]);
            System.out.print(" ");
            for(int i=0;i<n;i++)System.out.print(maxw[i]);
        }
    }
}
