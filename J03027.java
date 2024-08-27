/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 */
import java.util.Scanner;
import java.util.Stack;

public class J03027 {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            if(st.empty()){
                st.push(i);
            }
            else {
                if(s.charAt(st.peek())==s.charAt(i)){
                    st.pop();
                }
                else st.push(i);
            }
        }
        if(st.empty()){
            System.out.print("Empty String");
            return;
        }
        String tmp = "";
        while(!st.empty()){
            tmp+=s.charAt(st.peek());
            st.pop();
        }
        for(int i=tmp.length()-1;i>=0;i--)System.out.print(tmp.charAt(i));
    }
}
