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

public class J07008 {
    public static boolean check(ArrayList<Integer> arr,int[] a,int n){
        int pos = 0;
        for(int i=1;i<=n;i++){
            if(a[i]==0&&arr.get(i)<pos)return false;
            else if(a[i]==0&&arr.get(i)>pos)pos = arr.get(i);
        }
        return true;
    }
    static int[] a = new int[1000];
    static int n,ok;
    static TreeSet<String> res = new TreeSet<>();
    public static void Try(int i,ArrayList<Integer> arr,int ok){
        for(int j=0;j<=1;j++){
            a[i] = j;
            if(j==0)ok++;
            if(i==n){
                String tmp = "";
                for(int it=1;it<=n;it++){
                    if(a[it]==0&&ok>1){
                        tmp += Integer.toString(arr.get(it))+" ";
                    }
                }
                if(ok>1&&check(arr,a,n))res.add(tmp);
            }
            else Try(i+1,arr,ok);
            if(j==0)ok--;
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        try{
            FileReader reader = new FileReader("DAYSO.in");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                String[] arrString = line.split("\\s+");
                for(int i=0;i<arrString.length;i++){
                    try{
                        arr.add(Integer.parseInt(arrString[i]));
                    }
                    catch(Exception e){
                        
                    }
                }
            }
        }
        catch(Exception e){
            
        }
        n = arr.get(0);  // Lấy số phần tử từ phần tử đầu tiên trong danh sách
        Try(1, arr,0);
        for(String x:res)System.out.println(x);
    }
}
