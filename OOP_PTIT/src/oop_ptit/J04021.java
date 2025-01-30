/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
class IntSet{
    private int[] a;
    public IntSet(int[] a){
        this.a = a;
    }
    public IntSet union(IntSet s){
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0;i<a.length;i++)ts.add(a[i]);
        int[] b = s.a;
        for(int i=0;i<b.length;i++)ts.add(b[i]);
        int[] set = new int[ts.size()];
        int i=0;
        for(Integer x:ts){
            set[i++] = x;
        }
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

public class J04021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
