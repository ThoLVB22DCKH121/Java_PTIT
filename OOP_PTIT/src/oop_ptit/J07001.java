/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 */
import java.io.File;
import java.io.IOException;//một ngoại lệ được ném ra khi có lỗi xảy ra trong các thao tác nhập/xuất (I/O)
import java.io.FileReader;//Lớp này được sử dụng để đọc dữ liệu từ một tệp tin theo ký tự.
import java.io.BufferedReader;//Lớp này giúp đọc văn bản từ một luồng đầu vào ký tự, cung cấp khả năng đệm để cải thiện hiệu suất khi đọc.
public class J07001 {
    public static void main(String[] args){
        try{
            //Bắt đầu một khối try để bắt các ngoại lệ tiềm ẩn có thể xảy ra trong quá trình thực thi mã bên trong khối này.
            //Nếu có lỗi xảy ra, chương trình sẽ chuyển sang khối catch.
            FileReader reader  = new FileReader("DATA.in");
            //BufferedReader cung cấp khả năng đọc dữ liệu theo dòng (line) và đệm dữ liệu
            //giúp cải thiện hiệu suất khi đọc tệp tin.
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(IOException e){
            //In ra thông tin chi tiết về ngoại lệ vừa xảy ra, bao gồm cả dấu vết ngăn xếp (stack trace),
            //giúp lập trình viên xác định được nguyên nhân và vị trí xảy ra lỗi.
            e.printStackTrace();
        }
    }
}
