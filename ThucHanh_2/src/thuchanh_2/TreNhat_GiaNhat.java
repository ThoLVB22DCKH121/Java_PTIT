/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_2;

/**
 *
 * @author LE VAN THO
 */
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
import java.util.*;
//
class YoungAndOld implements Comparable<YoungAndOld>{
    private String name;
    private long time;
    public YoungAndOld(String name, Date date) throws ParseException{
        this.name = name;
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        Date now = myDate.parse("10/04/2022");
        time = now.getTime() - date.getTime();
    }
    //
    @Override
    public int compareTo(YoungAndOld s){
        return Long.compare(this.time, s.time);
    }
    //
    @Override 
    public String toString(){
        return this.name;
    }
}
//
public class TreNhat_GiaNhat {
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<YoungAndOld> set = new ArrayList<>();
        while(t-- > 0){
            String[] solve = sc.nextLine().split(" ");
            set.add(new YoungAndOld(solve[0], myDate.parse(solve[1])));
        }
        Collections.sort(set);
        System.out.println(set.get(0) + "\n" + set.get(set.size() - 1));
    }
    
}
