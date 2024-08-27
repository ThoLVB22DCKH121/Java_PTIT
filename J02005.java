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

public class J02005 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] cnt1 = new int[2000];
        int[] cnt2 = new int[2000];
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int tmp;
        for(int i=0;i<n;i++){
            tmp = scanner.nextInt();
            cnt1[tmp]=1;
        }
        for(int i=0;i<m;i++){
            tmp = scanner.nextInt();
            cnt2[tmp]=1;
        }
        for(int i=0;i<=1000;i++){
            if(cnt1[i]==1||cnt2[i]==1)System.out.print(i+" ");
        }
    }
}
