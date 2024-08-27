package oop_ptit;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class J03010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        Map<String, Integer> map = new HashMap<>();
        for(String s:arr){
            s = s.trim();
            String[] arr1 = s.split("\\s+");
            String tmp = "";
            for(int i=0;i<arr1.length-1;i++){
                tmp += arr1[i].substring(0,1).toLowerCase();
            }
            String email = arr1[arr1.length-1].toLowerCase() + tmp;
            if(!map.containsKey(email)){
                map.put(email,1);
                System.out.println(email + "@ptit.edu.vn");
            } else {
                int count = map.get(email);
                map.put(email, count + 1);
                System.out.println(email + (count + 1) + "@ptit.edu.vn");
            }
        }
    }
}
