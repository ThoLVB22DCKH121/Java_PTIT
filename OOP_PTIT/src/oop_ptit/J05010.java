/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
class MatHang{
    private String maMatHang, tenMatHang, nhomMatHang;
    private double loiNhuan;

    @Override
    public String toString() {
        return maMatHang+" "+tenMatHang + " " + nhomMatHang + " " + String.format("%.2f", loiNhuan);
    }

    public MatHang(String maMatHang, String tenMatHang, String nhomMatHang, double loiNhuan) {
        this.maMatHang = maMatHang;
        this.tenMatHang = tenMatHang;
        this.nhomMatHang = nhomMatHang;
        this.loiNhuan = loiNhuan;
    }

    public double getLoiNhuan() {
        return loiNhuan;
    }
    
    
}
public class J05010 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String mmh = Integer.toString(i+1);
            String tmh = sc.nextLine();
            String nmh = sc.nextLine();
            double gm = sc.nextDouble();
            double gb = sc.nextDouble();
            sc.nextLine();
            arr.add(new MatHang(mmh,tmh,nmh,gb-gm));
        }
        arr.sort((m1,m2)->Double.compare(m2.getLoiNhuan(), m1.getLoiNhuan()));
        for(MatHang x:arr)System.out.println(x);
    }
}
