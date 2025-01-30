/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit;

/**
 *
 * @author LE VAN THO
 */
import java.util.Scanner;
import java.lang.Math;

class Point{
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}

public class J04008 {
    public static double dodai(Point p1,Point p2){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2)+Math.pow(p1.getY()-p2.getY(), 2));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Point p1 = new Point(x1,y1);
            Point p2 = new Point(x2,y2);
            Point p3 = new Point(x3,y3);
            if(dodai(p1,p2)+dodai(p2,p3)<=dodai(p1,p3)){
                System.out.println("INVALID");
                continue;
            }
            if(dodai(p1,p2)>=dodai(p2,p3)+dodai(p1,p3)){
                System.out.print("INVALID");
                continue;
            }
            if(dodai(p1,p2)+dodai(p1,p3)<=dodai(p2,p3)){
                System.out.print("INVALID");
                continue;
            }
            else System.out.printf("%.3f",dodai(p1,p2)+dodai(p1,p3)+dodai(p2,p3));
            System.out.println();
        }
    }
}
