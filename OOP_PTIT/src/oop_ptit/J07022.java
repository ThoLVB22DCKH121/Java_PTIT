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
import java.io.*;
public class J07022 {
    public static void main(String[] args) throws IOException{
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String[] res = sc.nextLine().split("\\s+");
            for(String tmp:res){
                try{
                    int n = Integer.parseInt(tmp);
                }
                catch(Exception e){
                    if(!tmp.equals(""))arr.add(tmp);
                }
            }
        }
        Collections.sort(arr);
        for(String x:arr){
            System.out.print(x+" ");
        }
    }
}
