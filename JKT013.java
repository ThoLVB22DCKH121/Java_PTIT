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
public class JKT013 {
    public static void soLocPhat(String s){
        Queue<String> q = new LinkedList<>();
        ArrayList<String> a = new ArrayList<>();
        q.add("6");
        q.add("8");
        while(true){
            String tmp = q.poll();
            a.add(tmp);
            if(tmp.equals(s))break;
            q.add(tmp+"6");
            q.add(tmp+"8");
        }
        System.out.println(a.size());
        for(int i=a.size()-1;i>=0;i--)System.out.print(a.get(i)+" ");
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            int n = sc.nextInt();
            String s = "";
            while(n-->0)s+="8";
            soLocPhat(s);
        }
    }
}
