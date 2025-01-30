/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.io.*;

public class J08020 {
    public static boolean check(String s){
        Stack<Integer> st = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                    st.push(i);
                }
                else{
                    if(s.charAt(i)==')'&&s.charAt(st.peek())=='('){
                        st.pop();
                    }
                    else if(s.charAt(i)=='}'&&s.charAt(st.peek())=='{'){
                        st.pop();
                    }
                    else if(s.charAt(i)==']'&&s.charAt(st.peek())=='['){
                        st.pop();
                    }
                }
            }
        if(st.empty())return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0){
            String s = sc.nextLine();
            if(check(s))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
