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
        return nhom + " " + tenGV;
    }

    public String getMaM() {
        return maM;
    }

    public String getTenM() {
        return tenM;
    }
    public int compareTo(HocPhan other){
        return Integer.compare(Integer.parseInt(this.nhom), Integer.parseInt(other.nhom));
    }
    
}
public class J05079 {
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
            mp.put(ma, new HocPhan(ma,ten,nhom,tengv));
        }
        Collections.sort(arr);
        int q = sc.nextInt();
        while(q-->0){
            String ma = sc.next();
            System.out.println("Danh sach nhom lop mon "+mp.get(ma).getTenM()+":");
            for(HocPhan x:arr){
                if(x.getMaM().equals(ma))System.out.println(x);
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
THCS2D20
*/