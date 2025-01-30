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
public class J07078 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("STRING.in"));
        int test = Integer.parseInt(sc.nextLine().trim());
        while(test-->0){
            ArrayList<Integer> arr = new ArrayList<>();
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();
            for(int i=0;i<s1.length()-s2.length()+1;i++){
                if(s1.substring(i, i+s2.length()).equals(s2))arr.add(i+1);
            }
            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
