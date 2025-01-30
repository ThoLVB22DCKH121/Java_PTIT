/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
public class J02026 {
    static int n,k;
    static int[] a = new int[100];
    public static void Try(int i, ArrayList<Integer> arr){
        for(int j=a[i-1]+1;j<=n-k+i;j++){
            if(i>1&&arr.get(j)<arr.get(a[i-1]))continue;
            a[i] = j;
            if(i==k){
                for(int it=1;it<=k;it++){
                    System.out.print(arr.get(a[it])+" ");
                }
                System.out.println();
            }
            else Try(i+1,arr);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            n = sc.nextInt();
            k = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(0);
            for(int i=1;i<=n;i++)arr.add(sc.nextInt());
            arr.sort((s1,s2)->s1-s2);
            Try(1,arr);
        }
    }
}
