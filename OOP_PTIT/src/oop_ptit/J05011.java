/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.time.*;
import java.time.format.*;

class KhachHang {

    private String maKhachHang, tenKhachHang;
    private Duration timeChoi;

    public KhachHang(String maKhachHang, String tenKhachHang, Duration timeChoi) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.timeChoi = timeChoi;
    }

    @Override
    public String toString() {
        return maKhachHang + " " + tenKhachHang + " " + timeChoi.toHours() + " gio " + timeChoi.toMinutes() % 60 + " phut";
    }

    public Duration getTimeChoi() {
        return timeChoi;
    }

}

public class J05011 {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String mkh = sc.nextLine();
            String tkh = sc.nextLine();
            String gv = sc.nextLine();
            String gr = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime timestart = LocalTime.parse(gv, formatter);
            LocalTime timeend = LocalTime.parse(gr, formatter);
            arr.add(new KhachHang(mkh, tkh, Duration.between(timestart, timeend)));
        }
        arr.sort((kh1, kh2) -> kh2.getTimeChoi().compareTo(kh1.getTimeChoi()));
        for (KhachHang x : arr) {
            System.out.println(x);
        }
    }
}
