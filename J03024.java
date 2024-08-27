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

public class J03024 {
    public static String check(String s){
        if(s.charAt(0)=='0')return "INVALID";
        int le = 0, chan = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'0'||s.charAt(i)>'9')return "INVALID";
            if((s.charAt(i)-'0')%2==0)chan++;
            if((s.charAt(i)-'0')%2!=0)le++;
        }
        if((chan+le)%2==0&&chan>le)return "YES";
        else if((chan+le)%2!=0&&chan<le)return "YES";
        else return "NO";
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
