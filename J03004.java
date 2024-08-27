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
import java.util.*;

public class J03004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while(test-- >0){
            String s = scanner.nextLine();
            s = s.trim();
            String[] arr = s.split("\\s+");
            String tmp = "";
            for(int i=1;i<arr.length;i++){
                String pos = arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase();
                tmp += pos;
                if(i<arr.length-1)tmp +=" ";
            }
            tmp += ","+" "+arr[0].toUpperCase();
            System.out.println(tmp);
        }
    }
}
