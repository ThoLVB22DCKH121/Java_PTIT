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

public class J01025 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        int minl1 = Math.min(x1, x3);
        int minl2 = Math.min(y1, y3);
        int maxr1 = Math.max(x2, x4);
        int maxr2 = Math.max(y2, y4);
        int Smin = Math.max(Math.abs(maxr2-minl2), Math.abs(maxr1-minl1));
        System.out.print(Smin*Smin);
    }
}
