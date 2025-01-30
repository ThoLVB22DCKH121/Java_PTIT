/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;
 /* LE VAN THO
 */
import java.util.*;
public class J08015 {
    public static int lower(long a[],int left, int right, long x){
        int res = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] >= x){
                res = mid; // cập nhật
                //Tìm thêm đáp án tốt hơn
                right = mid - 1;
            }
            else
                left = mid + 1;
        }
        return res;
    }
    public static int upper(long a[], int left, int right, long x){
        int res = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] <= x){
            res = mid; // cập nhật
            //Tìm thêm đáp án tốt hơn
            left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] arr = new long[n];
            for(int i=0;i<n;i++)arr[i] = sc.nextLong();
            Arrays.sort(arr);
            long cnt = 0;
            for(int i=0;i<n;i++){
                int it1 = lower(arr,i+1,n-1,x-arr[i]);
                int it2 = upper(arr,i+1,n-1,x-arr[i]);
                if(it1!=-1&&it2!=-1)cnt += it2 - it1 + 1;
            }
            System.out.println(cnt);
        }
    }
}
