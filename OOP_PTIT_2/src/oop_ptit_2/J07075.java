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
class MonHoc74{
    private String maM, tenM;
    private int stc;

    public MonHoc74(String maM, String tenM, int stc) {
        this.maM = maM;
        this.tenM = tenM;
        this.stc = stc;
    }

    @Override
    public String toString() {
        return tenM;
    }

    
    
}
class LopHocPhan implements Comparable<LopHocPhan>{
    private String maN,tenGV,phonghoc;
    private int kip,thu;
    private MonHoc74 a;

    public LopHocPhan(String maN, int thu, String tenGV, String phonghoc, int kip, MonHoc74 a) {
        this.maN = maN;
        this.thu = thu;
        this.tenGV = tenGV;
        this.phonghoc = phonghoc;
        this.a = a;
        this.kip = kip;
    }
    public int compareTo(LopHocPhan other){
        if(this.thu==other.thu){
            if(this.kip==other.kip){
                return this.tenGV.compareTo(other.tenGV);
            }
            return Integer.compare(this.kip, other.kip);
        }
        return Integer.compare(this.thu, other.thu);
    }

    @Override
    public String toString() {
        return maN + " " + a + " " + thu + " " + kip + " " + phonghoc;
    }

    public String getTenGV() {
        return tenGV;
    }
    
}
public class J07075 {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Map<String,MonHoc74> mp = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            int stc = Integer.parseInt(sc.nextLine().trim());
            mp.put(ma, new MonHoc74(ma,ten,stc));
        }
        sc.close();
        sc = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc.nextLine().trim());
        ArrayList<LopHocPhan> arr = new ArrayList<>();
        for(int i=0;i<m;i++){
            String maM = sc.nextLine().trim();
            int thu = Integer.parseInt(sc.nextLine().trim());
            int kip = Integer.parseInt(sc.nextLine().trim());
            String tenGV = sc.nextLine().trim();
            String phong = sc.nextLine().trim();
            arr.add(new LopHocPhan(String.format("HP%03d",i+1),thu,tenGV,phong,kip,mp.get(maM)));
        }
        Collections.sort(arr);
        String ten = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN "+ten+":");
        for(LopHocPhan x:arr){
            if(x.getTenGV().equals(ten))System.out.println(x);
        }
        sc.close();
    }
}
