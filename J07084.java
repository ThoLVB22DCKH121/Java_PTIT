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
import java.time.format.*;
import java.time.*;
class SinhVien{
    private String tenSinhVien;
    private long timeOnline;
    public SinhVien(String tenSinhVien,long timeOnline){
        this.tenSinhVien = tenSinhVien;
        this.timeOnline = timeOnline;
    }
    public String toString(){
        return tenSinhVien+" "+Long.toString(timeOnline);
    }
    public long getTimeOnline(){
        return timeOnline;
    }
}
public class J07084 {
    public static long tinhTimeOnline(String time1,String time2){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime start = LocalDateTime.parse(time1,formatter);
        LocalDateTime end = LocalDateTime.parse(time2,formatter);
        // Tính khoảng cách giữa 2 thời gian
        Duration duration = Duration.between(start, end);
        return duration.toMinutes();
    }
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten = sc.nextLine().trim();
            String time1 = sc.nextLine().trim();
            String time2 = sc.nextLine().trim();
            long online = tinhTimeOnline(time1,time2);
            arr.add(new SinhVien(ten,online));
        }
        arr.sort((t1,t2)->Long.compare(t2.getTimeOnline(), t1.getTimeOnline()));
        for(SinhVien x:arr)System.out.println(x);
    }
}
