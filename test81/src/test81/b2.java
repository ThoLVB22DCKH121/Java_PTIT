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
import java.math.*;
public class b2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] isPrime = new int[1000001];
        for(int i=2;i<1000001;i++)isPrime[i] = 1;
        for(int i=2;i<1001;i++){
            if(isPrime[i] == 1){
                for(int j=i*i;j<1000001;j+=i)isPrime[j] = 0;
            }
        }
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(isPrime[arr[i]]==0){
                int cnt1=0,cnt2=0,x=arr[i],y=arr[i];
                while(isPrime[x]!=1){
                    x--;cnt1++;
                }
                while(isPrime[y]!=1){
                    y++;cnt2++;
                }
                cnt+=Math.min(cnt1, cnt2);
            }
        }
        System.out.print(cnt);
    }
}
