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
public class J07011 {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<String> arr = new ArrayList<>();
        Map<String,Long> mp = new HashMap<>();
        while(sc.hasNext()){
            String[] s = sc.nextLine().trim().split("[^a-zA-Z0-9]+");
            for(String x:s){
                if(x.length()==0)continue;
                String tmp = x.toLowerCase();
                if(mp.containsKey(tmp)){
                    mp.put(tmp,mp.get(tmp)+1);
                }
                else{
                    mp.put(tmp, 1l);
                    arr.add(tmp);
                }
            }
        }
        arr.sort(new Comparator<String>(){
            public int compare(String s1,String s2){
                if(mp.get(s1)==mp.get(s2))return s1.compareTo(s2);
                else return Long.compare(mp.get(s2), mp.get(s1));
            }
        });
        for(String x:arr){
            System.out.println(x+" "+mp.get(x));
        }
    }
}
