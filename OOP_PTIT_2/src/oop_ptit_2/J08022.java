/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit_2;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;

public class J08022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] d = new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]<arr[j]){
                        d[i]=arr[j];
                        break;
                    }
                }
            }
            for(int i:d){
                if(i!=0)System.out.print(i+" ");
                else System.out.print("-1 ");
            }
            System.out.println();
        }
    }
}
