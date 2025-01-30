package oop_ptit;

import java.util.Scanner;
import java.util.ArrayList;

public class J01013 {
    public static void main(String[] args){
        //Sàng số nguyên tố
        int[] pr = new int[1000001];//Khởi tạo mảng với tất cả giá trị là 1 
        for(int i = 2; i < 1000001; i++) pr[i] = 1;
        pr[0] = pr[1] = 0;
        for(int i = 2; i <= 1000; i++){
            if(pr[i] == 1){
                for(int j = i * i; j <= 1000000; j += i){
                    pr[j] = 0;//Loại bỏ các ước của số nguyên tố
                }
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2; i <= 1000000; i++){
            if(pr[i] == 1) arr.add(i);//Lưu danh sách các số nguyên tố để truy xuất nhanh
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;// Đặt giá trị kiểu long tránh tràn số
        while(n-- > 0){
            int a = sc.nextInt();
            for(int prime:arr){
                // Dừng sớm nếu prime > sqrt(a)
                if(prime*prime>a) break;
                while(a % prime == 0){
                    sum += prime;
                    a /= prime;
                }
            }
            if(a>1)sum+=a;// Nếu còn lại là số nguyên tố lớn
        }
        System.out.print(sum);
    }
}
