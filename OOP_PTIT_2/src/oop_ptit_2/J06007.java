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
class MonHoc07{
    private String maM, tenM;

    public MonHoc07(String maM, String tenM) {
        this.maM = maM;
        this.tenM = tenM;
    }

    public String getMaM() {
        return maM;
    }
}
class GiangVien07{
    private String maGV, tenGV;
    private double gc;

    public GiangVien07(String maGV, String tenGV) {
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
public class J06007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,MonHoc07> mp1 = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String maM = s[0].trim();
            String tenM = "";
            for(int j=1;j<s.length;j++)tenM += s[j]+" ";
            mp1.put(maM, new MonHoc07(maM,tenM.trim()));
        }
        ArrayList<GiangVien07> arr = new ArrayList<>();
        Map<String,GiangVien07> mp2 = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<m;i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String maGV = s[0].trim();
            String tenGV = "";
            for(int j=1;j<s.length;j++)tenGV += s[j]+" ";
            arr.add(new GiangVien07(maGV,tenGV.trim()));
            mp2.put(maGV, new GiangVien07(maGV,tenGV.trim()));
        }
        int k = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<k;i++){
            String maGV = sc.next();
            String maM = sc.next();
            GiangVien07 a = mp2.get(maGV);
            a.setGc(a.getGc()+sc.nextDouble());
            mp2.put(maGV, a);
        }
        for(GiangVien07 x:arr){
            System.out.println(mp2.get(x.getMaGV()));
        }
    }
}
/*
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
2
GV01 INT1155 113,2
GV02 INT1306 126,72
*/