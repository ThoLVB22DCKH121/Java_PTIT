/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_2;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class WordSet {
    private String solve;
    public WordSet(String solve){
        this.solve = solve.toLowerCase();
    }
    //
    protected String union(WordSet reference){
        TreeSet<String> res = new TreeSet<>(Arrays.asList(this.solve.split(" ")));
        res.addAll(Arrays.asList(reference.solve.split(" ")));
        ArrayList<String> data = new ArrayList<>();
        for(String x: res){
            data.add(x);
        }
        return " ".join(" ", data);
    }
    //
    protected String intersection(WordSet reference){
        TreeSet<String> x = new TreeSet<>(Arrays.asList(this.solve.split(" ")));
        TreeSet<String> y = new TreeSet<>(Arrays.asList(reference.solve.split(" ")));
        x.retainAll(y);
        ArrayList<String> res = new ArrayList<>();
        for(String i: x){
            res.add(i);
        }
        return " ".join(" ", res);
    }
    //
}
//
public class Word_Set {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}