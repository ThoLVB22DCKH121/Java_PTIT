/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
class Phanso {
    public long tu, mau;

    public Phanso(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    // Hàm tính ước chung lớn nhất (gcd)
    public long gcd(long a, long b) {
        while (a*b!=0) {
            if(a>b)a%=b;
            else b%=a;
        }
        return a+b;
    }

    // Phép cộng hai phân số và in ra kết quả bình phương của tử và mẫu, sau đó rút gọn
    public void phep1PhanSo(Phanso a) {
        long tmp1 = this.mau * a.mau; // Mẫu chung
        long tmp2 = this.tu * a.mau + this.mau * a.tu; // Tử sau khi cộng
        long tmp3 = gcd(tmp1 * tmp1, tmp2 * tmp2); // gcd của tử và mẫu sau khi bình phương
        System.out.print((tmp2 * tmp2) / tmp3 + "/" + (tmp1 * tmp1) / tmp3 + " ");
    }

    // Phép nhân hai phân số sau khi thực hiện phép cộng
    public void phep2PhanSo(Phanso a) {
        long tmp1 = this.mau * a.mau; // Mẫu chung
        long tmp2 = this.tu * a.mau + this.mau * a.tu; // Tử sau khi cộng
        long tmp3 = gcd(tmp1 * tmp1, tmp2 * tmp2); // gcd của tử và mẫu sau khi bình phương
        long tuBinhPhuong = (tmp2 * tmp2) / tmp3;
        long mauBinhPhuong = (tmp1 * tmp1) / tmp3;

        long tmp6 = this.tu * a.tu * tuBinhPhuong;
        long tmp7 = this.mau * a.mau * mauBinhPhuong;
        long tmp8 = gcd(tmp6, tmp7);

        System.out.println(tmp6 / tmp8 + "/" + tmp7 / tmp8);
    }
}

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            long x1 = sc.nextLong();
            long x2 = sc.nextLong();
            long x3 = sc.nextLong();
            long x4 = sc.nextLong();
            Phanso a = new Phanso(x1, x2);
            Phanso b = new Phanso(x3, x4);
            a.phep1PhanSo(b); // Gọi phép cộng phân số và in kết quả bình phương
            a.phep2PhanSo(b); // Gọi phép nhân phân số và in kết quả
        }
        sc.close();
    }
}