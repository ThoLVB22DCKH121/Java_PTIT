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
public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            String s = sc.next();
            int k = sc.nextInt();
            Set<Integer> st = new HashSet<>();
            for(int i=0;i<s.length();i++)st.add(s.charAt(i)-'0');
            if(st.size()+k<26)System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
/*
2
qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
4
qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
24
*/