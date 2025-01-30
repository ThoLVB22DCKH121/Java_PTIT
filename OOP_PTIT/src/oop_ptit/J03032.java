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
public class J03032 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            for(String x:arr){
                StringBuilder tmp = new StringBuilder(x);
                String pos = tmp.reverse().toString();
                System.out.print(pos+" ");
            }
            System.out.println();
        }
    }
}
