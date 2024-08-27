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

public class J03040 {
    public static boolean check1(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>=s.charAt(i+1))return false;
        }
        return true;
    }
    public static boolean check2(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1))return false;
        }
        return true;
    }
    public static boolean check3(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='6'&&s.charAt(i)!='8')return false;
        }
        return true;
    }
    public static boolean check4(String s){
        int ok1 = 0, ok2 = 0;
        if(s.charAt(0)==s.charAt(1)&&s.charAt(0)==s.charAt(2))ok1 = 1;
        if(s.charAt(3)==s.charAt(4))ok2 = 1;
        return ok1 == 1&&ok2 == 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            String s = sc.next();
            String tmp = "";
            for(int i=5;i<s.length();i++){
                if(s.charAt(i)>='0'&&s.charAt(i)<='9')tmp+=s.charAt(i);
            }
            if(check1(tmp)||check2(tmp)||check3(tmp)||check4(tmp))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
