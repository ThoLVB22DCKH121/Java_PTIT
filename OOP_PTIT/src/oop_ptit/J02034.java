/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.Scanner;
import java.lang.Math;

public class J02034 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),ok = 1,tmp = 0;
        int[] a = new int[300];
        for(int i=0;i<n;i++){
            tmp = scanner.nextInt();
            a[tmp]++;
            ok =Math.max(ok, tmp);
        }
        for(int i=1;i<ok;i++){
            if(a[i]==0){
                System.out.println(i);
                tmp = -1;
            }
        }
        if(tmp!=-1)System.out.print("Excellent!");
    }
}
