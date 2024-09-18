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
import java.io.*;
class DanhSach implements Comparable<DanhSach>{
    private String ho, tendem, ten;
    public DanhSach(String ho,String tendem,String ten){
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
    }
    public String toString(){
        return  ho+" "+tendem+" "+ten;
    }
    public int compareTo(DanhSach a){
        if(!this.ten.equals(a.ten))return this.ten.compareTo(a.ten);
        else if(!this.ho.equals(a.ho))return this.ho.compareTo(a.ho);
        else return this.tendem.compareTo(a.tendem);
    }
}
public class J07072 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<DanhSach> arr = new ArrayList<>();
        while(sc.hasNext()){
            try{
                String tmp = sc.nextLine().trim().toLowerCase();
                String[] s = tmp.split("\\s+");
                String ho = s[0].substring(0,1).toUpperCase()+s[0].substring(1).toLowerCase();
                String tendem = "";
                for(int i=1;i<s.length-1;i++){
                    tendem += s[i].substring(0,1).toUpperCase()+s[i].substring(1).toLowerCase();
                    if(i!=s.length-2)tendem += " ";
                }
                String ten = s[s.length-1].substring(0,1).toUpperCase()+s[s.length-1].substring(1).toLowerCase();
                arr.add(new DanhSach(ho,tendem,ten));
            }
            catch(Exception e){
                
            }
        }
        Collections.sort(arr);
        for(DanhSach x:arr)System.out.println(x);
    }
}
