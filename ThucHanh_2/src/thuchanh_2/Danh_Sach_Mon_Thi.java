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
import java.io.*;
class MonHoc{
    private String maMonHoc, tenMonHoc, hinhThuc;

    public MonHoc(String maMonHoc, String tenMonHoc, String hinhThuc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.hinhThuc = hinhThuc;
    }

    @Override
    public String toString() {
        return maMonHoc + " " + tenMonHoc + " " + hinhThuc;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }
    
}
public class Danh_Sach_Mon_Thi {
    public static void main(String[] agrs)throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String mm = sc.nextLine();
            String tm = sc.nextLine();
            String ht = sc.nextLine();
            arr.add(new MonHoc(mm,tm,ht));
        }
        arr.sort((m1,m2)->m1.getMaMonHoc().compareTo(m2.getMaMonHoc()));
        for(MonHoc x:arr)System.out.println(x);
    }
}
