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

public class J02037 {
    public static boolean dayUuThe(ArrayList<Integer> a){
        int sole = 0, sochan = 0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)%2==0)sochan+=1;
            else sole+=1;
        }
        if((a.size()%2==0&&sochan>sole)||(a.size()%2!=0&&sole>sochan))return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            String s = sc.nextLine().trim();
            String[] arr = s.split("\\s+");
            ArrayList<Integer> a = new ArrayList<>();
            for(String x:arr){
                a.add(Integer.parseInt(x));
            }
            if(dayUuThe(a))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
