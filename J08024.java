/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;

public class J08024 {
    public static void uocSo(long n){
        Queue<Long> q = new LinkedList<>();
        q.add((long)9);
        while(true){
            long tmp = q.poll();
            if(tmp%n==0){
                System.out.println(tmp);
                break;
            }
            q.add(tmp*10+0);
            q.add(tmp*10+9);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            long n = sc.nextLong();
            uocSo(n);
        }
    }
}
