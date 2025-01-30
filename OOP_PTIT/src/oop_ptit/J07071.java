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
class HoTen implements Comparable<HoTen>{
    private String Ten,Ho,DayDu;
    public HoTen(String Ten,String Ho,String DayDu){
        this.Ten = Ten;
        this.Ho = Ho;
        this.DayDu = DayDu;
    }
    public String toString(){
        return DayDu;
    }
    public int compareTo(HoTen a){
        if(this.Ten.equals(a.Ten))return this.Ho.compareTo(a.Ho);
        else return this.Ten.compareTo(a.Ten);
    }
}
public class J07071 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HoTen> arr1 = new ArrayList<>();
        ArrayList<HoTen> arr2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            String line = sc.nextLine().trim();
            String[] res = line.split("\\s+");
            arr1.add(new HoTen(res[res.length-1],res[0],line));
        }
        int k = Integer.parseInt(sc.nextLine());
        while(k-->0){
            String line = sc.nextLine().trim();
            String[] res = line.split("\\.");
            for(HoTen x:arr1){
                int ok = 0;
                String[] arr = x.toString().split("\\s+");
                if(arr.length!=res.length)continue;
                for(int i=0;i<res.length;i++){
                    if(res[i].equals("*"))continue;
                    if(!res[i].equals(arr[i].substring(0,1)))ok = 1;
                }
                if(ok == 0)arr2.add(x);
            }
            Collections.sort(arr2);
            for(HoTen x:arr2)System.out.println(x);
            arr2.clear();
        }
    }
}
