package oop_ptit;
/**
 *
 * @author LE VAN THO
 */
import java.util.*;
class SinhVien{
    private String tenSinhVien,maSinhVien,lopSinhVien,birtSinhVien;
    private float gpaSinhVien;
    public SinhVien(String tenSinhVien,String maSinhVien,String lopSinhVien,String birtSinhVien,float gpaSinhVien){
        this.tenSinhVien = tenSinhVien;
        this.maSinhVien = maSinhVien;
        this.lopSinhVien = lopSinhVien;
        this.gpaSinhVien = gpaSinhVien;
        this.birtSinhVien = birtSinhVien;
    }
    public String chuanhoa(){
        String[] arr = birtSinhVien.trim().split("/");
        String tmp = "";
        for(String x:arr){
            if(x.length()%2!=0){
                tmp += "0"+x+"/";
            }
            else tmp += x+"/";
        }
        return tmp.substring(0,tmp.length()-1);
    }
    public String toString(){
        return maSinhVien + " " + tenSinhVien + " " + lopSinhVien + " " + chuanhoa() + " " + String.format("%.2f", gpaSinhVien);
    }
}
public class J05003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma = "000"+Integer.toString(i+1);
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaysinh = sc.nextLine();
            float gpa = sc.nextFloat();
            sc.nextLine();
            arr.add(new SinhVien(ten,"B20DCCN"+ma.substring(ma.length()-3),lop,ngaysinh,gpa));
        }
        for(SinhVien x:arr)System.out.println(x);
    }
}