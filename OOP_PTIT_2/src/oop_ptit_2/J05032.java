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
import java.util.logging.Level;
import java.util.logging.Logger;
class Nguoi implements Comparable<Nguoi>{
    private String ten,ngaySinh;

    public Nguoi(String ten, String ngaySinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return ten;
    }
    public int compareTo(Nguoi other){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return f.parse(this.ngaySinh).compareTo(f.parse(other.ngaySinh));
        } catch (ParseException ex) {
        }
        return 0;
    }
}
public class J05032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Nguoi> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten = sc.next();
            String ns = sc.next();
            arr.add(new Nguoi(ten,ns));
        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1)+"\n"+arr.get(0));
    }
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
*/