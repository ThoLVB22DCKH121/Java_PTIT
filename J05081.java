/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 */
import java.util.Scanner;
class Mathang{
    private String mamh, tenmh, dvt;
    private long giamua, giaban;
    public void setMamh(String mamh){
        this.mamh = mamh;
    }
    public String getMamh(){
        return mamh;
    }
    public void setTenmh(String tenmh){
        this.tenmh = tenmh;
    }
    public String getTenmh(){
        return tenmh;
    }
    public void setDvt(String dvt){
        this.dvt = dvt;
    }
    public String getDvt(){
        return dvt;
    }
    public void setGiamua(long giamua){
        this.giamua = giamua;
    }
    public long getGiamua(){
        return giamua;
    }
    public void setGiaban(long giaban){
        this.giaban = giaban;
    }
    public long getGiaban(){
        return giaban;
    }
    public long Loinhuan(){
        return getGiaban()-getGiamua();
    }
}
public class J05081 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Mathang[] a = new Mathang[n];
        for(int i=0;i<n;i++){
            a[i] = new Mathang();
            String s = "00" + Long.toString(i+1);
            a[i].setMamh(s);
            a[i].setTenmh(sc.nextLine());
            a[i].setDvt(sc.next());
            a[i].setGiamua(sc.nextLong());
            a[i].setGiaban(sc.nextLong());
            sc.nextLine();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].Loinhuan()<a[j].Loinhuan()){
                    Mathang tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
                else if(a[i].Loinhuan()==a[j].Loinhuan()&&a[i].getMamh().compareTo(a[j].getMamh())>0){
                    Mathang tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("MH"+a[i].getMamh().substring(a[i].getMamh().length()-3)+" "+a[i].getTenmh()+" "+a[i].getDvt()+" "+a[i].getGiamua()+" "+a[i].getGiaban()+" "+a[i].Loinhuan());
        }
    }
}
