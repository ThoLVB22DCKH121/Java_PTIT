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

public class J01022 {
    public static char Nhiphan(int n, long k, long[] a){
        if(n==1)return '0';
	if(n==2)return '1';
        else if(k<=a[n-2])return Nhiphan(n-2,k,a);
	else return Nhiphan(n-1,k-a[n-2],a);
    }
    public static void main(String[] args){
        long[] fb=new long[93];
        fb[1]=1;
        fb[2]=1;
        for(int i=3;i<93;i++){
            fb[i] = fb[i-2]+fb[i-1];
        }
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- > 0){
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            System.out.println(Nhiphan(n,k,fb));
        }
    }
}
