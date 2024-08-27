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

public class J02014 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- >0){
            int n = scanner.nextInt();
            int[] a = new int[n];
            int sum = 0, ok = 0;
            for(int i=0;i<n;i++){
                a[i] = scanner.nextInt();
                sum += a[i];
            }
            int pos = a[0];
            for(int i=1;i<n;i++){
                if((sum-a[i])%2==0&&(sum-a[i])/2==pos){
                    ok = i;
                    break;
                }
                else pos+=a[i];
            }
            if(ok!=0&&ok!=n-1)System.out.println(ok+1);
            else System.out.println("-1");
        }
    }
}
