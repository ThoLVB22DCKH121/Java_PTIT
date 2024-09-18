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
public class J08012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[100005];
        for(int i=1;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            cnt[x]++;
            cnt[y]++;
        }
        for(int i=1;i<=100005;i++){
            if(cnt[i] == n-1){
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}
