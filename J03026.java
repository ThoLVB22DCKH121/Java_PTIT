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

public class J03026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            
            // Nếu hai chuỗi bằng nhau thì không có chuỗi con nào của s1 hoặc s2 mà không xuất hiện trong s2 hoặc s1
            if (s1.equals(s2)) {
                System.out.println("-1");
            } else {
                // In ra độ dài của chuỗi dài hơn vì chắc chắn toàn bộ chuỗi dài hơn không thể là chuỗi con của chuỗi ngắn hơn
                System.out.println(Math.max(s1.length(), s2.length()));
            }
        }
    }
}
