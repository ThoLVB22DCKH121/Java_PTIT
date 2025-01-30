/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
class WordSet{
    private String s;
    
    public WordSet(String s){
        this.s = s.toLowerCase();
    }
    
    public String union(WordSet t){
        String a = t.s.toLowerCase();
        String[] arr2 = a.trim().split("\\s+");
        String[] arr1 = s.trim().split("\\s+");
        TreeSet<String> ts = new TreeSet<>();
        for(String x:arr1)ts.add(x);
        for(String x:arr2)ts.add(x);
        String tmp = "";
        for(String x:ts)tmp+=x+=" ";
        return tmp;
    }
    
    public String intersection(WordSet t){
        String a = t.s.toLowerCase();
        String[] arr1 = a.trim().split("\\s+");
        String[] arr2 = s.trim().split("\\s+");
        TreeSet<String> ts1 = new TreeSet<>();
        TreeSet<String> ts2 = new TreeSet<>();
        for(String x:arr1)ts1.add(x);
        for(String x:arr2)ts2.add(x);
        String tmp = "";
        for(String x:ts1){
            if(ts2.contains(x)){
                tmp+=x+" ";
            }
        }
        return tmp;
    }
}
public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main2238632(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main8336296(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
