/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.time.format.*;
import java.time.*;
class SinhVien2 implements Comparable<SinhVien2>{
    private String maSinhVien, tenSinhVien, lopSinhVien, tenDeTai;
    private String gioBaoCao;

    public SinhVien2(String maSinhVien, String tenSinhVien, String lopSinhVien, String tenDeTai, String gioBaoCao) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.lopSinhVien = lopSinhVien;
        this.tenDeTai = tenDeTai;
        this.gioBaoCao = gioBaoCao;
    }
    
    @Override
    public String toString() {
        return maSinhVien + ", " + tenSinhVien + ", " + lopSinhVien + ", " + tenDeTai + ", " + gioBaoCao;
    }
    public int compareTo(SinhVien2 s){
        String[] arr1 = this.gioBaoCao.split(":");
        String[] arr2 = s.gioBaoCao.split(":");
        if(Integer.parseInt(arr1[0])!=Integer.parseInt(arr2[0])){
            return Integer.compare(Integer.parseInt(arr1[0]), Integer.parseInt(arr2[0]));
        }
        else return Integer.compare(Integer.parseInt(arr1[1]), Integer.parseInt(arr2[1]));
    }
    
}
public class Test2 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien2> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String msv = sc.nextLine();
            String tsv = sc.nextLine();
            String lsv = sc.nextLine();
            String tdt = sc.nextLine();
            String gbc = sc.nextLine();
            arr.add(new SinhVien2(msv,tsv,lsv,tdt,gbc));
        }
        Collections.sort(arr);
        for(SinhVien2 x:arr)System.out.println(x);
    }
}
