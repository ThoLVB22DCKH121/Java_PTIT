/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test81;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.io.*;
public class b1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<2*n;j++){
                if(j==n-i||j==n+i)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<2*n;i++){
            System.out.print("*");
        }
    }
}
