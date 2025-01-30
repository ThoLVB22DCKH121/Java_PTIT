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
import java.math.*;
class KhachHang50{
    private String maKH;
    private long heso, thanhtien, phutroi, tongtien;
    
    public KhachHang50(String ma,String sd, long csc, long csm){
        this.maKH = ma;
        if(sd.equals("KD"))this.heso = 3;
        else if(sd.equals("NN"))this.heso = 5;
        else if(sd.equals("TT"))this.heso = 4;
        else if(sd.equals("CN"))this.heso = 2;
        this.thanhtien = (csm-csc)*this.heso*550;
        long tmp = csm - csc;
        if(tmp>100)this.phutroi = Math.round(this.thanhtien*100/100.0);
        else if(tmp>=50)this.phutroi = Math.round(this.thanhtien*35/100.0);
        else this.phutroi = 0;
        this.tongtien = this.phutroi + this.thanhtien;
    }
    @Override
    public String toString() {
        return maKH + " " + heso + " " + thanhtien + " " + phutroi + " " + tongtien;
    }
    
}
public class J05050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<KhachHang50> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma = String.format("KH%02d", i+1);
            String sd = sc.next();
            long csc = sc.nextLong();
            long csm = sc.nextLong();
            arr.add(new KhachHang50(ma,sd,csc,csm));
        }
        for(KhachHang50 x:arr){
            System.out.println(x);
        }
    }
}
/*
3
KD
400
555
NN
58
400
CN
150
700
*/