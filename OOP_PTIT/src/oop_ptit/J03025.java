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

public class J03025 {
    public static String check(String s){
        int l = 0, r = s.length()-1, cnt = 0;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))cnt++;
            l++;
            r--;
        }
        if(s.length()%2==0&&cnt==1)return "YES";
        if(s.length()%2==1&&cnt<=1)return "YES";
        return "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}
