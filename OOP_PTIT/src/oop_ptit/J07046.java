/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.io.*;
import java.text.*;

class LuuTru{
    private String Mkh, Tenkh, Mp;
    private int soNgayLuuTru;
    public void setMkh(String Mkh){
        this.Mkh = Mkh;
    }
    public String getMkh(){
        return Mkh;
    }
    public void setMp(String Mp){
        this.Mp = Mp;
    }
    public String getMp(){
        return Mp;
    }
    public void setTenkh(String Tenkh){
        this.Tenkh = Tenkh;
    }
    public String getTenkh(){
        return Tenkh;
    }
    public int getSoNgayLuuTru() {
        return soNgayLuuTru;
    }
    public LuuTru(String Mkh, String Tenkh, String Mp, int soNgayLuuTru){
        this.Mkh = Mkh;
        this.Tenkh = Tenkh;
        this.Mp = Mp;
        this.soNgayLuuTru = soNgayLuuTru;
    }
}
public class J07046 {
    public static int tinhSoNgayLuuTru(String ngayDen, String ngayDi) throws ParseException {
        //SimpleDateFormat là một lớp trong Java giúp định dạng và phân tích (parse) các chuỗi ngày tháng theo một định dạng cụ thể.
        //Ở đây, dateFormat được định dạng theo mẫu dd/MM/yyyy, tức là ngày/tháng/năm, ví dụ 25/08/2024.
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //Hàm parse của SimpleDateFormat chuyển đổi chuỗi ngày tháng (dạng String) thành đối tượng Date.
        Date d1 = dateFormat.parse(ngayDen);
        Date d2 = dateFormat.parse(ngayDi);
        //getTime() trả về thời gian của đối tượng Date dưới dạng số mili giây tính từ 00:00:00 UTC ngày 1 tháng 1 năm 1970 (thời điểm Unix Epoch).
        //Hiệu số giữa d2.getTime() và d1.getTime() chính là chênh lệch thời gian giữa ngày đi và ngày đến, tính bằng mili giây.
        long diff = d2.getTime() - d1.getTime();
        //Số mili giây trong một ngày được tính là 1000 * 60 * 60 * 24 (1000 mili giây trong 1 giây, 60 giây trong 1 phút, 60 phút trong 1 giờ, 24 giờ trong 1 ngày).
        return (int) (diff / (1000 * 60 * 60 * 24));
    }
    public static void main(String[] args)throws IOException, ParseException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<LuuTru> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String MaKh = "000" + Integer.toString(i+1);
            String TenKh = sc.nextLine().trim();
            String Map = sc.nextLine().trim();
            String Ngayden = sc.nextLine().trim();
            String Ngaydi = sc.nextLine().trim();
            int ngayluutru = tinhSoNgayLuuTru(Ngayden, Ngaydi);
            a.add(new LuuTru("KH"+MaKh.substring(MaKh.length()-2),TenKh,Map,ngayluutru));
        }
        a.sort((kh1,kh2)->kh2.getSoNgayLuuTru()-kh1.getSoNgayLuuTru());
        for (LuuTru kh : a) {
            System.out.println(kh.getMkh() + " " + kh.getTenkh() + " " + kh.getMp() + " " + kh.getSoNgayLuuTru());
        }
    }
}
