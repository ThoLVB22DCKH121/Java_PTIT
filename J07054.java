/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
**/
import java.util.*;
import java.io.*;
class SinhVien implements Comparable<SinhVien>{
    private String tenSinhVien, maSinhVien;
    private float diemTrungBinh;
    private int loaiXepHang;
    public SinhVien(String tenSinhVien,String maSinhVien,float diemTrungBinh){
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.diemTrungBinh = diemTrungBinh;
    }
    public float getDiemTrungBinh(){
        return diemTrungBinh;
    }
    public void setLoaiXepHang(int loaiXepHang){
        this.loaiXepHang = loaiXepHang;
    }
    public int getLoaiXepHang(){
        return loaiXepHang;
    }
    public String chuanhoaTen(){
        String tmp = "";
        String[] arr = tenSinhVien.split("\\s+");
        for(String x:arr){
            tmp += x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return tmp;
    }
    public String toString(){
        return maSinhVien+" "+chuanhoaTen()+String.format("%.2f",diemTrungBinh)+" "+loaiXepHang;
    }
    public int compareTo(SinhVien a){
        if(this.diemTrungBinh!=a.diemTrungBinh)return Float.compare(a.diemTrungBinh, this.diemTrungBinh);
        else return this.maSinhVien.compareTo(a.maSinhVien);
    }
}
public class J07054 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<SinhVien> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            String maSinhVien = "000"+Integer.toString(i+1);
            String tenSinhVien = sc.nextLine().trim();
            float mon1 = Float.parseFloat(sc.nextLine().trim());
            float mon2 = Float.parseFloat(sc.nextLine().trim());
            float mon3 = Float.parseFloat(sc.nextLine().trim());
            a.add(new SinhVien(tenSinhVien,"SV"+maSinhVien.substring(maSinhVien.length()-2),(mon1*3+mon2*3+mon3*2)/8));
        }
        Collections.sort(a);
        int rank = 1;
        for (int i = 0; i < a.size(); i++) {
            if (i > 0 && a.get(i).getDiemTrungBinh() != a.get(i - 1).getDiemTrungBinh()) {
                rank = i + 1;
                //Điểm khác nhau thì rank của nó bằng vị trí trong danh sách tính từ 1
            }
            //Nếu điểm bằng nhau thì thứ tự rank như nhau
            a.get(i).setLoaiXepHang(rank);
        }
        for(SinhVien x:a){
            System.out.println(x);
        }
    }
}
