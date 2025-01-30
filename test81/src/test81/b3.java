/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test81;

/**
 *
 * @author LE VAN THO
 */

import java.util.*;
import java.io.*;
public class b3 {
    public static void main(String[] args)throws IOException,FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<String> arr = new ArrayList<>();
        LinkedHashMap<String,Integer> arr1 = new LinkedHashMap<>();
        while(sc.hasNext()){
            String line = sc.nextLine().trim().toLowerCase();
            String[] res = line.split("\\s+");
            String tmp ="";
            for(int i=0;i<res.length-1;i++){
                tmp+=res[i].substring(0,1);
            }
            if(arr1.containsKey(tmp+res)){
                arr1.put(tmp+res+Integer.toString(arr1.get(res)+1), 0);
                arr1.put(tmp+res,arr1.get(res)+1);
            }
            else arr1.put(tmp+res,0);
        }
        
    }
}
