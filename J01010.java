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

public class J01010 {
    public static void catdoi(String s){
        String a="";
        int ok1 = 1,ok2 = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='8'&&s.charAt(i)!='9'){
                System.out.print("INVALID");
                return;
            }
            if(s.charAt(i)=='0')a+="0";
            if(s.charAt(i)=='1'){
                a+="1";
                ok1=0;
            }
            if(s.charAt(i)=='8')a+="0";
            if(s.charAt(i)=='9')a+="0";
        }
        if(ok1==1){
            System.out.print("INVALID");
                return;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='0')ok2=1;
            if(ok2==1){
                System.out.print(a.charAt(i));
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- >0){
            String s = scanner.next();
            catdoi(s);
            System.out.println();
        }
    }
}
