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
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class J07002 {
    public static void main(String[] args){
        long sum = 0;
        try{
            FileReader reader = new FileReader("DATA.in");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                String[] arr = line.split("\\s+");
                for(int i=0;i<arr.length;i++){
                    if(arr[i].length()<=10&&arr[i].charAt(0)>='0'&&arr[i].charAt(0)<='9'){
                        int tmp = Integer.parseInt(arr[i]);
                        if(tmp<=2147483647&&tmp>=-2147483648)sum+=tmp;
                    }
                }
            }
            System.out.print(sum);
            bufferedReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
