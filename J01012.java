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

public class J01012 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- >0){
            int n = scanner.nextInt();
            int cnt = 0;
            for(int i=1;i*i<=n;i++){
                if(n%i==0&&i%2==0)cnt++;
                if(n%(n/i)==0&&(n/i)!=i&&(n/i)%2==0)cnt++;
            }
            System.out.println(cnt);
        }
    }
}
