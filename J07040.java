/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.io.*;
public class J07040 {
    public static void main(String[] args)throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> arr1 = (ArrayList<String>)ois.readObject();
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        for(String x:arr1){
            String[] words = x.toLowerCase().trim().split("\\s+");
            for(String word:words)set1.add(word);
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        //LinkedHashSet chỉ lưu được các phần tử khác nhau.
        //LinkedHashSet được cài đặt bằng bảng băm và danh sách liên kết, vì thế tốc độ tìm kiếm phần tử đạt được là O(1) .
        //LinkedHashSet có thứ tự là thứ tự bạn thêm các phần tử vào set.
        //LinkedHashSet chỉ lưu được các phần tử kiểu đối tượng.
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        while(sc.hasNextLine()){
            String[] tmp = sc.nextLine().toLowerCase().trim().split("\\s+");
            for(String x:tmp){
                if (!x.isEmpty()) {
                    set2.add(x);
                }
            }
        }
        for(String x:set2){
            if(set1.contains(x))System.out.println(x);
        }
   }
}
