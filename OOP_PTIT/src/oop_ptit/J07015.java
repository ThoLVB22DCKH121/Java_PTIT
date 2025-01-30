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
public class J07015 {
    public static void main(String[] args)throws IOException, ClassNotFoundException{
        int[] isPrime = new int[1000001];
        for(int i=2;i<1000001;i++)isPrime[i] = 1;
        for(int i=2;i<1001;i++){
            if(isPrime[i] == 1){
                for(int j=i*i;j<1000001;j+=i)isPrime[j] = 0;
            }
        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>)ois.readObject();
        int[] cnt = new int[1000001];
        for(int i:arr){
            cnt[i]++;
        }
        for(int i=0;i<10001;i++){
            if(cnt[i] > 0 && isPrime[i] == 1){
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}
