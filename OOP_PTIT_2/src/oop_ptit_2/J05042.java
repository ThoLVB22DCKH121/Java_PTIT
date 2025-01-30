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
class SinhVien42 implements Comparable<SinhVien42>{
    private String tenSV;
    private long bld, submit;

    public SinhVien42(String tenSV, long bld, long submit) {
        this.tenSV = tenSV;
        this.bld = bld;
        this.submit = submit;
    }

    @Override
    public String toString() {
        return tenSV + " " + bld + " " + submit;
    }
    
    public int compareTo(SinhVien42 other){
        if(this.bld==other.bld){
            if(this.submit==other.submit){
                return this.tenSV.compareTo(other.tenSV);
            }
            return Long.compare(this.submit, other.submit);
        }
        return Long.compare(other.bld, this.bld);
    }
}
public class J05042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien42> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ten = sc.nextLine();
            long bld = sc.nextLong();
            long sm = sc.nextLong();
            arr.add(new SinhVien42(ten,bld,sm));
        }
        Collections.sort(arr);
        for(SinhVien42 x:arr){
            System.out.println(x);
        }
    }
}
/*
2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
*/