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
public class J02024 {
    static int n;
    static int[] a = new int[100];
    static ArrayList<String> res = new ArrayList<>();
    public static void Try(int i,ArrayList<Integer> arr){
        for(int j=0;j<=1;j++){
            a[i] = j;
            if(i==n){
                int sum = 0;
                for(int it=1;it<=n;it++){
                    if(a[it]==1)sum += arr.get(it);
                }
                if(sum%2!=0){
                    String s = "";
                    for(int it=1;it<=n;it++){
                        if(a[it]==1)s += Integer.toString(arr.get(it))+" ";
                    }
                    res.add(s);
                }
            }
            else Try(i+1,arr);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(100000);
            for(int i=1;i<=n;i++)arr.add(sc.nextInt());
            arr.sort((s1,s2)->s2-s1);
            Try(1,arr);
            for(String s:res)System.out.print(s+"\n");
            res.clear();
        }
    }
}
