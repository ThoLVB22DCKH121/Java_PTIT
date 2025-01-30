/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit_2;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.io.*;
public class J07016 {
    public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException{
        int[] isPrime = new int[1000001];
        for(int i=2;i<1000001;i++)isPrime[i] = 1;
        for(int i=2;i<=1000;i++){
            for(int j=i*i;j<1000001;j+=i)isPrime[j] = 0;
        }
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ob.readObject();
        int[] cnt1 = new int[100000];
        int[] cnt2 = new int[100000];
        for(Integer x:arr1)cnt1[x]++;
        ob.close();
        ob = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ob.readObject();
        for(Integer x:arr2)cnt2[x]++;
        ob.close();
        arr1.sort((s1,s2)->s1-s2);
        for(Integer x:arr1){
            if(cnt1[x]>0&&cnt2[x]>0&&isPrime[x]==1){
                System.out.println(x+" "+cnt1[x]+" "+cnt2[x]);
                cnt1[x] = 0;
            }
        }
    }
}
