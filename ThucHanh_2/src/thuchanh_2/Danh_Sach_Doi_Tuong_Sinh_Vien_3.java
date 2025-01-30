/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_2;

/**
 *
 * @author LE VAN THO
 */

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Student{
    public static int id = 0;
    private String code = "B20DCCN", name = "", classmate, date = "", gpa;
    public Student(Scanner sc){
        id++;
        String ccode = String.format("%03d", id);
        this.code += ccode;
        String[] nname = sc.nextLine().trim().replaceAll("\\s+", " ").toLowerCase().split(" ");
        for(int i = 0;i < nname.length;i++){
            this.name += Character.toUpperCase(nname[i].charAt(0)) + nname[i].substring(1);
            this.name += " ";
        }
        this.name.trim();
        this.classmate = sc.nextLine();
        String[] birthDay = sc.nextLine().split("/");
        this.date = String.format("%02d", Integer.parseInt(birthDay[0])) + "/" + String.format("%02d", Integer.parseInt(birthDay[1])) + "/" + birthDay[2];
        this.gpa = String.format("%.2f", Double.parseDouble(sc.nextLine()));
    }
    
    public double getGPA(){
        return Double.parseDouble(this.gpa);
    }
    
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.classmate + " " + this.date + " " + this.gpa;
    }
}
//sort 2
class sortTheArrayList implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        return Double.compare(o2.getGPA(), o1.getGPA());
    }
}

public class Danh_Sach_Doi_Tuong_Sinh_Vien_3 {
    /**
     * @CampusETH
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Student(sc));
        }
        Collections.sort(set, new sortTheArrayList());
        for(Student x : set){
            System.out.println(x);
        }
    }
    
}
