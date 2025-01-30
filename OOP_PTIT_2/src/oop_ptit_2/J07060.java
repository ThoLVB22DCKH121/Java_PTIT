/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit_2;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.text.*;
public class J07060 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(f.format(f.parse(a).getTime()-f.parse(b).getTime()+f.parse("1/1/1997 0:0:0").getTime()));
    }
}
