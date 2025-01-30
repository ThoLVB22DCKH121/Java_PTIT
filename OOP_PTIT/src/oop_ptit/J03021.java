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

public class J03021 {
    public static boolean check1(String s){
        int l = 0, r = s.length()-1;
        while(l<r){
            if(s.charAt(r)!=s.charAt(l))return false;
            l++;
            r--;
        }
        return true;
    }
    public static String check2(String s){
        String tmp= "";
        String a = s.toLowerCase();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='b'||a.charAt(i)=='c')tmp+='2';
            if(a.charAt(i)=='d'||a.charAt(i)=='e'||a.charAt(i)=='f')tmp+='3';
            if(a.charAt(i)=='g'||a.charAt(i)=='h'||a.charAt(i)=='i')tmp+='4';
            if(a.charAt(i)=='j'||a.charAt(i)=='k'||a.charAt(i)=='l')tmp+='5';
            if(a.charAt(i)=='m'||a.charAt(i)=='n'||a.charAt(i)=='o')tmp+='6';
            if(a.charAt(i)=='p'||a.charAt(i)=='q'||a.charAt(i)=='r'||a.charAt(i)=='s')tmp+='7';
            if(a.charAt(i)=='t'||a.charAt(i)=='u'||a.charAt(i)=='v')tmp+='8';
            if(a.charAt(i)=='w'||a.charAt(i)=='x'||a.charAt(i)=='y'||a.charAt(i)=='z')tmp+='9';
        }
        if(check1(tmp))return "YES";
        else return "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            String s = sc.next();
            System.out.println(check2(s));
        }
    }
}
