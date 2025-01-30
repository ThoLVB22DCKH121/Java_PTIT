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
import java.io.*;
import java.math.*;
class Pair<T,U>{
    private T first;
    private U second;
    public Pair(T first,U second){
        this.first = first;
        this.second = second;
    }
    public boolean isPrime(){
        if((Integer)first<2 || (Integer)second<2)return false;
        for(int i=2;i<=Math.sqrt((Integer)first);i++){
            if((Integer)first%i==0)return false;
        }
        for(int i=2;i<=Math.sqrt((Integer)second);i++){
            if((Integer)second%i==0)return false;
        }
        return true;
    }
    public String toString(){
        return first+" "+second;
    }
}
public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
