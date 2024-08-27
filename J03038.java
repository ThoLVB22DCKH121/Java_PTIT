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

public class J03038 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] c = new int[300];
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(c[s.charAt(i)]==0){
                cnt++;
                c[s.charAt(i)]=1;
            }
        }
        System.out.print(cnt);
    }
}
