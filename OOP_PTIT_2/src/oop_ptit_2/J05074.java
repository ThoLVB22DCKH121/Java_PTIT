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
class SinhVien74{
    private String maSV, tenSV, lopSV;

    public SinhVien74(String maSV, String tenSV, String lopSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lopSV;
    }

    public String getMaSV() {
        return maSV;
    }
    
}
class DiemDanh{
    private String ghichu;

    public DiemDanh(String madd) {
        int sum = 10;
        for(int i=0;i<madd.length();i++){
            if(madd.charAt(i)=='v')sum-=2;
            if(madd.charAt(i)=='m')sum-=1;
        }
        if(sum<=0)this.ghichu = "0 KDDK";
        else this.ghichu = Integer.toString(sum);
    }

    public String getGhichu() {
        return ghichu;
    }
    
}
public class J05074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien74> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.next();
            arr.add(new SinhVien74(ma,ten,lop));
        }
        Map<String,DiemDanh> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            String ma = sc.next();
            String madd = sc.next();
            mp.put(ma, new DiemDanh(madd));
        }
        for(SinhVien74 x:arr){
            System.out.println(x+" "+mp.get(x.getMaSV()).getGhichu());
        }
        
    }
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
*/