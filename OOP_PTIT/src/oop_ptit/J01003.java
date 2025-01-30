/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.Scanner;

public class J01003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextInt();
        float b = scanner.nextInt();
        if(a==0&&b==0)System.out.print("VSN");
        else if(a!=0) System.out.printf("%.2f%n", -b/a);
        else System.out.print("VN");
    }
}
