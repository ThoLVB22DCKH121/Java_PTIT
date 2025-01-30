/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit_2;

/**
 *
 * @author LE VAN THO
 */
import java.io.*;
import java.util.*;
class WordSet{
    private TreeSet<String> t;
    public WordSet(String s) throws FileNotFoundException, IOException{
        this.t = new TreeSet<>();
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] arr = line.toLowerCase().trim().split("\\s+");
            for(String x:arr){
                this.t.add(x);
            }
        }
    }
    public WordSet(TreeSet<String> w){
        this.t = w;
    }
    public WordSet union(WordSet s){
        TreeSet<String> hop = new TreeSet<>();
        for(String x:this.t)hop.add(x);
        for(String x:s.t)hop.add(x);
        return new WordSet(hop);
    }
    public WordSet intersection(WordSet s){
        TreeSet<String> giao = new TreeSet<>();
        for(String x:this.t){
            if(s.t.contains(x))giao.add(x);
        }
        return new WordSet(giao);
    }
    public String toString(){
        String tmp = "";
        for(String x:t){
            tmp += x + " ";
        }
        return tmp;
    }
}
public class J07014 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
