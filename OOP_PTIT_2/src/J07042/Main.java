/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.*;
import java.util.*;

public class Main {
    public static int gcd(int a,int b){
        while(a*b!=0){
            if(a>b)a%=b;
            else b%=a;
        }
        return a+b;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) o.readObject();
        Collections.sort(a);
        HashSet<String> h = new HashSet<>();
        for(Pair i:a){
            if(i.getFirst() < i.getSecond() && !h.contains(i.toString()) && gcd(i.getFirst(),i.getSecond())==1){
                h.add(i.toString());
                System.out.println(i);
            }
        }
    }
}