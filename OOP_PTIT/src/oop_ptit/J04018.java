/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author LE VAN THO
 */
import java.util.*;
class SoPhuc{
    private int soThuc, soAo;
    public SoPhuc(int soThuc, int soAo){
        this.soThuc = soThuc;
        this.soAo = soAo;
    }
    public SoPhuc C(SoPhuc b){
        int tmp1 = 0, tmp2 = 0;
        tmp1 = this.soThuc+b.soThuc;
        tmp2 = this.soAo + b.soAo;
        return new SoPhuc(tmp1*this.soThuc-tmp2*this.soAo,tmp1*this.soAo+tmp2*this.soThuc);
    }
    public SoPhuc D(SoPhuc b){
        int tmp1 = 0, tmp2 = 0;
        tmp1 = this.soThuc+b.soThuc;
        tmp2 = this.soAo + b.soAo;
        return new SoPhuc(tmp1*tmp1-tmp2*tmp2,tmp1*tmp2+tmp1*tmp2);
    }
    public String toString(){
        return Integer.toString(soThuc)+" + "+Integer.toString(soAo)+"i";
    }
}
public class J04018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            SoPhuc p1 = new SoPhuc(sc.nextInt(),sc.nextInt());
            SoPhuc p2 = new SoPhuc(sc.nextInt(),sc.nextInt());
            SoPhuc p3 = p1.C(p2);
            SoPhuc p4 = p1.D(p2);
            System.out.println(p3+", "+p4);
        }
    }
}
