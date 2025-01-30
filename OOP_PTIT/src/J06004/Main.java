/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06004;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String msv = sc.nextLine();
            String tsv = sc.nextLine();
            String sdt = sc.nextLine();
            int sn = sc.nextInt();
            sc.nextLine();
            arr.add(new SinhVien(msv, tsv, sdt, sn));
        }
        for (int i = 0; i < m; i++) {
            BaiTapLon.setBaiTapLon(i + 1, sc.nextLine());
        }
        arr.sort((s1, s2) -> s1.getMaSinhVien().compareTo(s2.getMaSinhVien()));
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
