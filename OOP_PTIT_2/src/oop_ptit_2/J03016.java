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
import java.math.*;
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            String s = sc.next();
            long sum1 = 0, sum2 = 0;
            for(int i=0;i<s.length();i++){
               if(i%2==0) sum1 += s.charAt(i)-'0';
               else sum2 += s.charAt(i)-'0';
            }
            if(Math.abs(sum1-sum2)%11==0)System.out.println("1");
            else System.out.println("0");
        }
    }
}
/*
2
76945
363588395960667043875487
*/