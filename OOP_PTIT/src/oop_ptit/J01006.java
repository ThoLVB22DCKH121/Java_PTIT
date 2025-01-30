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

public class J01006 {
    public static void main(String[] args){
        long[] fb = new long[100];
        fb[0] = 0;
        fb[1] = 1;
        for(int i=2;i<93;i++){
            fb[i] = fb[i-1] + fb[i-2];
        }
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- > 0){
            int n = scanner.nextInt();
            System.out.println(fb[n]);
        }
    }
}
