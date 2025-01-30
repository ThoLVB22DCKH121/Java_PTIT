/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.Scanner;
class LuongGiaoVien{
    private String mn, ten;
    private long lcb;
    public void setMn(String mn){
        this.mn = mn;
    }
    public String getMn(){
        return mn;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getTen(){
        return ten;
    }
    public void setLcb(long lcb){
        this.lcb = lcb;
    }
    public long getLcb(){
        return lcb;
    }
    public long Phucap(){
        if(mn.substring(0,2).equals("HT"))return 2000000;
        else if(mn.substring(0,2).equals("HP"))return 900000;
        else return 500000;
    }
    public long Bacluong(){
        long tmp = Long.parseLong(mn.substring(2, 4));
        return tmp;
    }
    public long Thunhap(){
        return getLcb()*Bacluong()+Phucap();
    }
}
public class J04015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LuongGiaoVien a = new LuongGiaoVien();
        a.setMn(sc.next());
        sc.nextLine();
        a.setTen(sc.nextLine());
        a.setLcb(sc.nextLong());
        System.out.print(a.getMn()+" "+a.getTen()+" "+a.Bacluong()+" "+a.Phucap()+" "+a.Thunhap());
    }
}
