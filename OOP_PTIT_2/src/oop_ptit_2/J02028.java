/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit_2;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
public class J02028 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long sum = 0, ok = 0;
            Queue<Integer> q = new LinkedList<>();
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                sum += x;
                q.add(x);
                if(sum>k){
                    while(sum>k&&!q.isEmpty()){
                        sum -= q.remove();
                    }
                }
                if(sum==k&&q.size()>0)ok=1;
            }
            if(ok==1)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
