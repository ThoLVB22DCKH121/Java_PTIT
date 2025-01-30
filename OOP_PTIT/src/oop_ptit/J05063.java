/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
class DaThuc{
    private String s;
    public DaThuc(String s){
        this.s = s;
    }
    public DaThuc cong(DaThuc q){
        String[] arr1 = s.trim().split("[+]");
        String[] arr2 = q.s.trim().split("[+]");
        int[] cnt = new int[1000000];
        for(String x:arr1){
            String[] hm = x.trim().split("[*x^]");
            cnt[Integer.parseInt(hm[3])]+=Integer.parseInt(hm[0]);
        }
        for(String x:arr2){
            String[] hm = x.trim().split("[*x^]");
            cnt[Integer.parseInt(hm[3])]+=Integer.parseInt(hm[0]);
        }
        String tmp = "";
        for(int i=10000;i>=0;i--){
            if(cnt[i]>0)tmp += Integer.toString(cnt[i])+"*x^"+Integer.toString(i)+" + ";
        }
        return new DaThuc(tmp.substring(0, tmp.length()-3));
    }
    public String toString(){
        return s;
    }
}
public class J05063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
