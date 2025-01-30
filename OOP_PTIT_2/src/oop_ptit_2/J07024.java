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
    public WordSet difference(WordSet s){
        TreeSet<String> res = new TreeSet<>();
        for(String x:this.t){
            if(!s.t.contains(x))res.add(x);
        }
        return new WordSet(res);
    }
    public String toString(){
        String tmp = "";
        for(String x:t){
            tmp += x + " ";
        }
        return tmp;
    }
}
public class J07024 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
