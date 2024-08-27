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

public class J01017 {
    public static boolean Check(String s){
        for(int i=0;i<s.length()-1;i++){
            if(Math.abs(s.charAt(i)-s.charAt(i+1))!=1)return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- >0){
            String s = scanner.next();
            if(Check(s))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
