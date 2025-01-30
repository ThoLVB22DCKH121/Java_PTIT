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
class SinhVien{
    private String maSinhVien, tenSinhVien, lopSinhVien, tenDeTai;
    private String gioBaoCao;

    public SinhVien(String maSinhVien, String tenSinhVien, String lopSinhVien, String tenDeTai, String gioBaoCao) {
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
    
}
public class Test1 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String msv = sc.nextLine();
            String tsv = sc.nextLine();
            String lsv = sc.nextLine();
            String tdt = sc.nextLine();
            String gbc = sc.nextLine();
            arr.add(new SinhVien(msv,tsv,lsv,tdt,gbc));
        }
        for(SinhVien x:arr)System.out.println(x);
    }
}
