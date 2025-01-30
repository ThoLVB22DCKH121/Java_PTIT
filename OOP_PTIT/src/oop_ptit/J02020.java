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

public class J02020 {
    static int[] a = new int[100];
    static int n,k,ok=0;
    public static void Try(int i){
        for(int j=a[i-1]+1;j<=n-k+i;j++){
            a[i] = j;
            if(i == k){
                for(int it=1;it<=k;it++){
                    System.out.print(a[it]);
                }
                System.out.print(" ");
                ok++;
            }
            else Try(i+1);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        Try(1);
        System.out.print("\n" +"Tong cong co " + ok + " to hop");
    }
}
