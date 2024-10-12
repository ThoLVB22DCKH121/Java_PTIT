/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
import java.math.*;

class Point{
    private double x,y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
    }
}
public class J04010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Point p1 = new Point(x1,y1);
            Point p2 = new Point(x2,y2);
            Point p3 = new Point(x3,y3);
            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);
            if(a+b<=c || a+c<=b || b+c<=a){
                System.out.println("INVALID");
            }
            else {
                double s = (a+b+c)/2;
                double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.printf("%.3f\n", Math.PI*Math.pow(a*b*c/(4*area),2));
            }
        }
    }
}
