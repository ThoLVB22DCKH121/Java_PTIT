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
public class J02103 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt(),pos = 0;
        while(test-- >0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            int[][] c = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j] = scanner.nextInt();
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    b[j][i] = a[i][j];
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int k=0;k<m;k++){
                        c[i][j] += a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Test "+ (pos+=1)+":");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
