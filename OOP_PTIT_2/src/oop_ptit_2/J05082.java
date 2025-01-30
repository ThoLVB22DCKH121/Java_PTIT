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
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class KhachHang82 implements Comparable<KhachHang82>{
    private String maKH, tenKH, gioitinh, ngaysinh, diachi;
    
    public String chuanhoaten(String s){
        String[] arr = s.trim().split("\\s+");
        String res = "";
        for(String x:arr){
            res+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }
    
    public String chuanhoangay(String s){
        String[] arr = s.trim().split("/");
        return String.format("%02d", Integer.parseInt(arr[0]))+"/"+String.format("%02d", Integer.parseInt(arr[1]))+"/"+arr[2];
    }
        
    public KhachHang82(String maKH, String tenKH, String gioitinh, String ngaysinh, String diachi) {
        this.maKH = maKH;
        this.tenKH = chuanhoaten(tenKH);
        this.gioitinh = gioitinh;
        this.ngaysinh = chuanhoangay(ngaysinh);
        this.diachi = diachi;
    }
    public int compareTo(KhachHang82 other){
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        try {
            return f.parse(this.ngaysinh).compareTo(f.parse(other.ngaysinh));
        } catch (ParseException ex) {
        }
        return 0;
    }

    @Override
    public String toString() {
        return maKH + " " + tenKH + " " + gioitinh + " " + diachi + " " + ngaysinh;
    }
    
}
public class J05082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang82> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten = sc.nextLine();
            String gioitinh = sc.next();
            String ns = sc.next();
            sc.nextLine();
            String dc = sc.nextLine();
            arr.add(new KhachHang82(String.format("KH%03d", i+1),ten,gioitinh,ns,dc));
        }
        Collections.sort(arr);
        for(KhachHang82 x:arr){
            System.out.println(x);
        }
    }
}
/*
2
 nGuyen VAN     nAm
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
 TRan    vAn     biNh
Nam
14/11/1995
Phung Khoang-Nam Tu Liem-Ha Noi
*/