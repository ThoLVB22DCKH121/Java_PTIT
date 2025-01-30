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
public class J07029 {
    public static void main(String[] args)throws IOException, ClassNotFoundException{
        int[] isPrime = new int[1000001];
        for(int i=2;i<1000001;i++)isPrime[i] = 1;
        for(int i=2;i<1001;i++){
            if(isPrime[i] == 1){
                for(int j=i*i;j<1000001;j+=i)isPrime[j] = 0;
            }
        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>)ois.readObject();
        ArrayList<Integer> ListPrime = new ArrayList<>();
        int[] cnt = new int[1000001];
        for(Integer i:arr){
            cnt[i]++;
        }
        for(Integer i:arr){
            if(cnt[i]>0 && isPrime[i] == 1){
                ListPrime.add(i);
                isPrime[i] = 0;
            }
        }
        ListPrime.sort((s1,s2)->s2-s1);
        for(int i=0;i<10;i++)System.out.println(ListPrime.get(i)+" "+cnt[ListPrime.get(i)]);
    }
}
