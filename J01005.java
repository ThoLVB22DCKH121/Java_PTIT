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

public class J01005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            double n = sc.nextInt();
            double h = sc.nextDouble();
            for(int i=1;i<n;i++){
                System.out.printf("%.6f ",h*Math.sqrt(i/n));
            }
            System.out.println();
        }
    }
}
