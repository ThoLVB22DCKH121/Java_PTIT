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

public class J02106 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), cnt = 0;
        int[][] a = new int[n][3];
        for(int i=0;i<n;i++){
            int tmp = 0;
            for(int j=0;j<3;j++){
                a[i][j] = scanner.nextInt();
                if(a[i][j]==1)tmp++;
            }
            if(tmp>(3-tmp))cnt++;
        }
        System.out.print(cnt);
    }
}
