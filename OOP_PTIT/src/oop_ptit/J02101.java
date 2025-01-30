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
public class J02101 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- >0){
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j] = scanner.nextInt();
                }
            }
            for(int i=0;i<n;i++){
                if(i%2==0){
                    for(int j=0;j<n;j++){
                        System.out.print(a[i][j]+" ");
                    }
                }
                else{
                    for(int j=n-1;j>=0;j--){
                        System.out.print(a[i][j]+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
