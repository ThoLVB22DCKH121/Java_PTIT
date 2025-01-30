/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
public class JKT014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] d = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                d[i] = 1;
            }
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<n;i++){
                while(!st.empty()&&a[i]>=a[st.peek()]){
                    d[i]+=d[st.peek()];
                    st.pop();
                }
                st.push(i);
            }
            for(int i=0;i<n;i++){
                System.out.print(d[i]+" ");
            }
        }
    }
}
