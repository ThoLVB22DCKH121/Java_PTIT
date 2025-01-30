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
class SinhVien38{
    private String maSV, tenSV, lopSV, emailSV;
    
    public String chuanhoaten(String s){
        String tmp = "";
        String[] arr = s.split("\\s+");
        for(String x:arr){
            tmp += x.substring(0, 1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return tmp.trim();
    }
    public SinhVien38(String maSV, String tenSV, String lopSV, String emailSV) {
        this.maSV = maSV;
        this.tenSV = chuanhoaten(tenSV);
        this.lopSV = lopSV;
        this.emailSV = emailSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lopSV;
    }

    public String getMaSV() {
        return maSV;
    }
}
class DoanhNghiep38{
    private String maDN, tenDN;
    private long ssv;

    public DoanhNghiep38(String maDN, String tenDN, long ssv) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.ssv = ssv;
    }

    public long getSsv() {
        return ssv;
    }

    public String getTenDN() {
        return tenDN;
    }

    public String getMaDN() {
        return maDN;
    }
    
}
class ThucTap38 implements Comparable<ThucTap38>{
    private SinhVien38 a;
    private DoanhNghiep38 b;

    public ThucTap38(SinhVien38 a, DoanhNghiep38 b) {
        this.a = a;
        this.b = b;
    }
    public int compareTo(ThucTap38 other){
        return this.a.getMaSV().compareTo(other.a.getMaSV());
    }

    @Override
    public String toString() {
        return a.toString();
    }

    public DoanhNghiep38 getB() {
        return b;
    }
}
public class J07038 {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        Map<String,SinhVien38> mp1 = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            mp1.put(ma, new SinhVien38(ma,ten,lop,email));
        }
        sc.close();
        sc = new Scanner(new File("DN.in"));
        Map<String, DoanhNghiep38> mp2 = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<m;i++){
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            long sl = Long.parseLong(sc.nextLine().trim());
            mp2.put(ma, new DoanhNghiep38(ma,ten,sl));
        }
        sc.close();
        sc = new Scanner(new File("THUCTAP.in"));
        ArrayList<ThucTap38> arr = new ArrayList<>();
        int k = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<k;i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            arr.add(new ThucTap38(mp1.get(s[0]),mp2.get(s[1])));
        }
        Collections.sort(arr);
        int q = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<q;i++){
            String ma = sc.nextLine().trim();
            long sl = mp2.get(ma).getSsv();
            System.out.println("DANH SACH THUC TAP TAI "+mp2.get(ma).getTenDN()+":");
            for(ThucTap38 x:arr){
                if(sl>0&&x.getB().getMaDN().equals(ma)){
                    System.out.println(x);
                    sl--;
                }
            }
        }
    }
}
