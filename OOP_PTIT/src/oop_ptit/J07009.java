/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.io.*;
class IntSet{
    private int[] a;
    public IntSet(int[] a){
        this.a = a;
    }
    public IntSet intersection(IntSet s){
        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        int[] b = s.a;
        for(int i:a)ts1.add(i);
        for(int i:b)ts2.add(i);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:ts1){
            if(ts2.contains(i))list.add(i);
        }
        int j = 0;
        int[] set = new int[list.size()];
        for(int i:list)set[j++]=i;
        return new IntSet(set);
    }
    public String toString(){
        String s = "";
        for(int i=0;i<a.length;i++){
            s+=Integer.toString(a[i])+" ";
        }
        return s;
    }
}
public class J07009 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
