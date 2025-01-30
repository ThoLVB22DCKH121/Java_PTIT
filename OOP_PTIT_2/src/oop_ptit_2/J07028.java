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
import java.io.*;
import java.text.*;
class MonHoc28{
    private String maM, tenM;

    public MonHoc28(String maM, String tenM) {
        this.maM = maM;
        this.tenM = tenM;
    }

    public String getMaM() {
        return maM;
    }
}
class GiangVien28{
    private String maGV, tenGV;
    private double gc;

    public GiangVien28(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    @Override
    public String toString() {
        return tenGV + " " + String.format("%.2f",gc);
    }

    public String getMaGV() {
        return maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public double getGc() {
        return gc;
    }

    public void setGc(double gc) {
        this.gc = gc;
    }
}
public class J07028 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Map<String,MonHoc28> mp1 = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String maM = s[0].trim();
            String tenM = "";
            for(int j=1;j<s.length;j++)tenM += s[j]+" ";
            mp1.put(maM, new MonHoc28(maM,tenM.trim()));
        }
        sc.close();
        sc = new Scanner(new File("GIANGVIEN.in"));
        ArrayList<GiangVien28> arr = new ArrayList<>();
        Map<String,GiangVien28> mp2 = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<m;i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String maGV = s[0].trim();
            String tenGV = "";
            for(int j=1;j<s.length;j++)tenGV += s[j]+" ";
            arr.add(new GiangVien28(maGV,tenGV.trim()));
            mp2.put(maGV, new GiangVien28(maGV,tenGV.trim()));
        }
        sc.close();
        sc = new Scanner(new File("GIOCHUAN.in"));
        int k = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<k;i++){
            String maGV = sc.next();
            String maM = sc.next();
            GiangVien28 a = mp2.get(maGV);
            a.setGc(a.getGc()+sc.nextDouble());
            mp2.put(maGV, a);
        }
        for(GiangVien28 x:arr){
            System.out.println(mp2.get(x.getMaGV()));
        }
    }
}
