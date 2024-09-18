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
public class J02027 {
    public static int lower(int a[], int n, int x){
        int res = -1;
        int left = 0, right = n - 1;
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
    public static int upper(int a[], int n, int x){
        int res = -1;
        int left = 0, right = n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] < x){
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
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int cnt = 0;
            for(int i=0;i<n;i++){
                int it1 = upper(a,n,k+a[i]);
                if(it1!=-1)cnt += it1 - i;
            }
            System.out.println(cnt);
        }
    }
}
