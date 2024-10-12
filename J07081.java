
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.io.*;
class SinhVien implements Comparable<SinhVien>{
    private String maSinhVien,tenSinhVien,sdtSinhVien,emailSinhVien;
    private String Ho,Ten,Dem;
    public SinhVien(String maSinhVien,String tenSinhVien,String sdtSinhVien,String emailSinhVien,String Ho,String Ten,String Dem){
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.sdtSinhVien = sdtSinhVien;
        this.emailSinhVien = emailSinhVien;
        this.Ho = Ho;
        this.Ten = Ten;
        this.Dem = Dem;
    }
    public String toString(){
        return maSinhVien+" "+tenSinhVien+" "+sdtSinhVien+" "+emailSinhVien;
    }
    public int compareTo(SinhVien a){
        if(!this.Ten.equals(a.Ten))return this.Ten.compareTo(a.Ten);
        else if(!this.Ho.equals(a.Ho))return this.Ho.compareTo(a.Ho);
        else if(!this.Dem.equals(a.Dem))return this.Dem.compareTo(a.Dem);
        else return this.maSinhVien.compareTo(a.maSinhVien);
    }
}
public class J07081 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<SinhVien> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String sdt = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            String[] arr = ten.split("\\s+");
            String dem = "";
            for(int j=1;j<arr.length-1;j++)dem+=arr[j]+" ";
            res.add(new SinhVien(ma, ten, sdt, email, arr[0], arr[arr.length-1], dem.trim()));
        }
        Collections.sort(res);
        for(SinhVien x:res)System.out.println(x);
    }
}
