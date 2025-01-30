/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06003;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            String msv = sc.nextLine();
            String tsv = sc.nextLine();
            String sdt = sc.nextLine();
            int sn = sc.nextInt();
            sc.nextLine();
            arr1.add(new SinhVien(msv,tsv,sdt,sn));
        }
        ArrayList<Nhom> arr2 = new ArrayList<>();
        for(int i=0;i<m;i++){
            String tbt = sc.nextLine();
            arr2.add(new Nhom(i+1,tbt));
        }
        int q = sc.nextInt();
        while(q-->0){
            int query = sc.nextInt();
            System.out.println("DANH SACH NHOM "+Integer.toString(query)+":");
            for(SinhVien x:arr1){
                if(x.getSoNhom()==query)System.out.println(x);
            }
            System.out.print("Bai tap dang ky: ");
            for(Nhom x:arr2){
                if(x.getSoNhom()==query)System.out.println(x);
            }
        }
    }
}
