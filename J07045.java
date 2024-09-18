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

class LoaiPhong implements Comparable<LoaiPhong>{
    private String Kyhieu, Tenphong, Dongiangay, Phiphucvu;
    public void setKyhieu(String Kyhieu){
        this.Kyhieu = Kyhieu;
    }
    public String getKyhieu(){
        return Kyhieu;
    }
    public void setTenphong(String Tenphong){
        this.Tenphong = Tenphong;
    }
    public String getTenphong(){
        return Tenphong;
    }
    public void setDongiangay(String Dongiangay){
        this.Dongiangay = Dongiangay;
    }
    public String getDongiangay(){
        return Dongiangay;
    }
    public void setPhiphucvu(String Phiphucvu){
        this.Phiphucvu = Phiphucvu;
    }
    public String getPhiphucvu(){
        return Phiphucvu;
    }
    public LoaiPhong(String line){
        String[] arr = line.split("\\s+");
        this.Kyhieu = arr[0];
        this.Tenphong = arr[1];
        this.Dongiangay = arr[2];
        this.Phiphucvu = arr[3];
    }
    public String toString(){
        //Ghi dè phương thức của trả về nội dung đối tượng
        return getKyhieu()+" "+getTenphong()+" "+getDongiangay()+" "+getPhiphucvu();
    }
    public int compareTo(LoaiPhong other) {
        // Sắp xếp theo tên phòng tăng dần
        return this.Tenphong.compareTo(other.Tenphong);
    }
}
public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
