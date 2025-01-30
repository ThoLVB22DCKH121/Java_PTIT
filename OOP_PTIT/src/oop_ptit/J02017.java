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
public class J02017 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(stack.empty()){
                stack.push(a[i]);
            }
            else {
                if((stack.peek()+a[i])%2==0){
                    stack.pop();
                }
                else stack.push(a[i]);
            }
        }
        System.out.println(stack.size());
    }
}
