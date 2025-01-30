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
class SinhVien34 implements Comparable<SinhVien34>{
    private String maSV, tenSV, lopSV, email, doanhNghiep;
    private int stt;

    public SinhVien34(String maSV, String tenSV, String lopSV, String email, String doanhNghiep, int stt) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
        this.stt = stt;
    }

    @Override
    public String toString() {
        return stt + " " + maSV + " " + tenSV + " " + lopSV + " " + email + " " + doanhNghiep;
    }
    public int compareTo(SinhVien34 other){
        return this.maSV.compareTo(other.maSV);
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }
}
public class J05035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien34> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma = sc.next().trim();
            sc.nextLine();
            String ten = sc.nextLine().trim();
            String lop = sc.next().trim();
            String email = sc.next().trim();
            String dn = sc.next().trim();
            arr.add(new SinhVien34(ma,ten,lop,email,dn,i+1));
        }
        Collections.sort(arr);
        int q = sc.nextInt();
        while(q-->0){
            String dn = sc.next();
            for(SinhVien34 x:arr){
                if(x.getDoanhNghiep().equals(dn))System.out.println(x);
            }
        }
    }
}
/*
6
B17DCCN016
Le Khac Tuan Anh
D17HTTT2
test1@stu.ptit.edu.vn
VIETTEL
B17DCCN107
Dao Thanh Dat 
D17CNPM5
test2@stu.ptit.edu.vn
FPT
B17DCAT092
Cao Danh Huy
D17CQAT04-B
test3@stu.ptit.edu.vn
FPT
B17DCCN388
Cao Sy Hai Long
D17CNPM2
test4@stu.ptit.edu.vn
VNPT
B17DCCN461
Dinh Quang Nghia
D17CNPM2
test5@stu.ptit.edu.vn
FPT
B17DCCN554
Bui Xuan Thai
D17CNPM1
test6@stu.ptit.edu.vn
GAMELOFT
1
FPT
*/