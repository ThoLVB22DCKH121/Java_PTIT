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
public class J07030 {
    public static void main(String[] args)throws IOException, ClassNotFoundException{
        int[] isPrime = new int[1000001];
        for(int i=2;i<1000001;i++)isPrime[i] = 1;
        for(int i=2;i<1001;i++){
            for(int j=i*i;j<1000001;j+=i)isPrime[j] = 0;
        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>)ois.readObject();
        ois.close();
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>)ois.readObject();
        int[] cnt1 = new int[1000001];
        int[] cnt2 = new int[1000001];
        for(int i=0;i<100000;i++){
            cnt1[arr1.get(i)]++;
            cnt2[arr2.get(i)]++;
        }
        arr1.sort((s1,s2)->s1-s2);
        for(Integer i:arr1){
            if(isPrime[i] == 1 && isPrime[1000000-i] == 1 && cnt2[1000000-i] > 0 && i < 1000000-i){
                System.out.println(i+" "+(1000000-i));
                isPrime[i] = 0;
            }
        }
    }
}
