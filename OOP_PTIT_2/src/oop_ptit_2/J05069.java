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
class CLB{
    private String maCLB, tenCLB;
    private long giave;

    public CLB(String maCLB, String tenCLB, long giave) {
        this.maCLB = maCLB;
        this.tenCLB = tenCLB;
        this.giave = giave;
    }

    public String getMaCLB() {
        return maCLB;
    }

    public String getTenCLB() {
        return tenCLB;
    }

    public long getGiave() {
        return giave;
    }
    
}

class TranDau{
    private String maTran,tenCLB;
    private long cdv,doanhthu;

    public TranDau(String maTran, long cdv) {
        this.maTran = maTran;
        this.cdv = cdv;
    }

    public TranDau(String maTran, String tenCLB, long cdv, long doanhthu) {
        this.maTran = maTran;
        this.tenCLB = tenCLB;
        this.cdv = cdv;
        this.doanhthu = doanhthu;
    }
    

    public String getMaTran() {
        return maTran;
    }

    public long getCdv() {
        return cdv;
    }
    
}
public class J05069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,CLB> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long giave = sc.nextLong();
            mp.put(ma, new CLB(ma,ten,giave));
        }
        int m = sc.nextInt();
        ArrayList<TranDau> arr = new ArrayList<>();
        for(int i=0;i<m;i++){
            String ma = sc.next();
            long sl = sc.nextLong();
            arr.add(new TranDau(ma,sl));
        }
        for(TranDau x:arr){
            String ma = x.getMaTran();
            long sl = x.getCdv();
            String ten = mp.get(ma.substring(1,3)).getTenCLB();
            long giave = mp.get(ma.substring(1,3)).getGiave();
            System.out.println(ma+" "+ten+" "+Long.toString(sl*giave));
        }
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
*/