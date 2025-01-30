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
public class J07032 {
    public static boolean checkThuanNghich(int n){
        String s = Integer.toString(n);
        int l = 0, r = s.length()-1;
        if(s.length() <= 1||s.length()%2 == 0)return false;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))return false;
            if((s.charAt(l)-'0')%2 == 0)return false;
            if((s.charAt(r)-'0')%2 == 0)return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args)throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>)ois.readObject();
        ois.close();
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>)ois.readObject();
        ArrayList<Integer> List = new ArrayList<>();
        int[] cnt1 = new int[1000001];
        int[] cnt2 = new int[1000001];
        for(Integer i:arr1){
            cnt1[i]++;
        }
        for(Integer i:arr2){
            cnt2[i]++;
        }
        arr1.sort((s1,s2)->s1-s2);
        for(Integer i:arr1){
            if(checkThuanNghich(i) && cnt1[i] > 0 && cnt2[i] > 0){
                List.add(i);
                cnt2[i] += cnt1[i];
                cnt1[i] = 0;
            }
        }
        for(int i=0;i<10;i++){
            System.out.println(List.get(i)+" "+cnt2[List.get(i)]);
        }
    }
}
