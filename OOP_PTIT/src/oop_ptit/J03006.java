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

public class J03006 {
    public static boolean check(String s){
        int l = 0, r = s.length()-1;
        if(s.charAt(r)!='2'&&s.charAt(r)!='3'&&s.charAt(r)!='5'&&s.charAt(r)!='7')return false;
        while(l<r){
            if(s.charAt(r)!=s.charAt(l))return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            String s = sc.next();
            if(check(s))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
