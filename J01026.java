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
import java.lang.Math;

public class J01026 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- >0){
            int n = scanner.nextInt();
            int tmp = (int)Math.sqrt(n);
            if(n==tmp*tmp){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
