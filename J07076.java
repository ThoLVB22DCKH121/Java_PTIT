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
import java.io.*;

public class J07076 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int test = Integer.parseInt(sc.nextLine().trim());
        while(test-->0){
            String[] arr1 = sc.nextLine().trim().split("\\s+");
            int n = Integer.parseInt(arr1[0]);
            int m = Integer.parseInt(arr1[1]);
            int k = Integer.parseInt(arr1[2])-1;
            int[][] a = new int[1000][1000];
            int cnt = 0;
            String[] arr2 = sc.nextLine().trim().split("\\s+");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j] = Integer.parseInt(arr2[cnt]);
                    cnt += 1;
                }
            }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i][k]>a[j][k]){
                        int tmp = a[i][k];
                        a[i][k] = a[j][k];
                        a[j][k] = tmp;
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++)System.out.print(a[i][j]+ " ");
                System.out.println();
            }
        }
    }
}
