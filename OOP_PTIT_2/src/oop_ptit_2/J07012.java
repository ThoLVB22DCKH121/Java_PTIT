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
public class J07012 {
    public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        arr = (ArrayList<String>)ois.readObject();
        ArrayList<String> res = new ArrayList<>();
        Map<String,Long> mp = new HashMap<>();
        for(String s:arr){
            String[] line = s.trim().split("[^a-zA-Z0-9]+");
            for(String i:line){
                if(i.length()==0)continue;
                String tmp = i.toLowerCase();
                if(mp.containsKey(tmp)){
                    mp.put(tmp, mp.get(tmp)+1);
                }
                else {
                    mp.put(tmp, 1l);
                    res.add(tmp);
                }
            }
        }
        res.sort(new Comparator<String>(){
            public int compare(String s1,String s2){
                if(mp.get(s2)==mp.get(s1)){
                    return s1.compareTo(s2);
                }
                else return Long.compare(mp.get(s2),mp.get(s1));
            }
        });
        for(String x:res){
            System.out.println(x+" "+mp.get(x));
        }
    }
}
