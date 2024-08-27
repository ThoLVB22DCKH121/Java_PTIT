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

public class J02010 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int ok = 1;
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    ok = 0;
                }
            }
            if(ok == 1)break;
            System.out.print("Buoc "+(i+1)+": ");
            for(int k=0;k<n;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}
