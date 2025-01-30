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
class HocPhan implements Comparable<HocPhan>{
    private String maM, tenM, nhom, tenGV;

    public HocPhan(String maM, String tenM, String nhom, String tenGV) {
        this.maM = maM;
        this.tenM = tenM;
        this.nhom = nhom;
        this.tenGV = tenGV;
    }

    @Override
    public String toString() {
        return maM + " " + tenM + " " + nhom;
    }

    public String getMaM() {
        return maM;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getTenM() {
        return tenM;
    }
    public int compareTo(HocPhan other){
        if(this.maM.equals(other.maM)) return Integer.compare(Integer.parseInt(this.nhom), Integer.parseInt(other.nhom));
        else return this.maM.compareTo(other.maM);
    }
    
}
public class J05080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HocPhan> arr = new ArrayList<>();
        Map<String,HocPhan> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.next();
            sc.nextLine();
            String tengv = sc.nextLine();
            arr.add(new HocPhan(ma,ten,nhom,tengv));
            mp.put(tengv, new HocPhan(ma,ten,nhom,tengv));
        }
        Collections.sort(arr);
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String ten = sc.nextLine();
            System.out.println("Danh sach cho giang vien "+mp.get(ten).getTenGV()+":");
            for(HocPhan x:arr){
                if(x.getTenGV().equals(ten))System.out.println(x);
            }
        }
    }
}
/*
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
*/