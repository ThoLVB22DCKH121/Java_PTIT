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
import java.math.*;

public class J08021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            String s = sc.next();
            boolean[] check = new boolean[s.length()];
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(!st.empty()&&s.charAt(st.peek())=='('&&s.charAt(i)==')'){
                   check[st.peek()]=true;
                   check[i]=true;
                   st.pop();
                }
                else st.push(i);
            }
            int cnt = 0,res = 0;
            for(int i=0;i<s.length()-1;i++){
                if(check[i]==true&&check[i+1]==true){
                    cnt++;
                }
                else{
                    res = Math.max(res, cnt+1);
                    cnt = 0;
                }
            }
            res = Math.max(res, cnt+1);
            System.out.println(res);
        }
    }
}
