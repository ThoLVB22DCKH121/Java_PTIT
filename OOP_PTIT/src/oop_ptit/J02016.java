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
import java.math.*;
public class J02016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int ok = 0;
            Arrays.sort(arr);
            for(int k=n-1;k>=2;k--){
                //Sử dụng kĩ thuật 2 con trỏ để tìm 2 số tạo nên tam giác vuông
                int i = 0,j = k - 1;
                while(i<j){
                    long a = arr[i]*arr[i];
                    long b = arr[j]*arr[j];
                    long c = arr[k]*arr[k];
                    if(a+b == c){
                        ok = 1;
                        break;
                    }
                    // Nếu tổng bình phương 2 cạnh bé hơn c thì tìm cạnh a lớn hơn
                    else if(a+b < c){
                        i++;
                    }
                    //Nếu tổng bình phương 2 cạnh lớn hơn c thì tìm cạnh b bé hơn
                    else j--;
                }
                if(ok == 1)break;
            }
            if(ok == 1)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
