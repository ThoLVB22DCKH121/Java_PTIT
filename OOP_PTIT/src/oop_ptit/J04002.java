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

class Rectange{
    private double width, height;
    private String color;
    public Rectange(){
        this.width = 1;
        this.height = 1;
    }
    public Rectange(double width,double height,String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public double findArea(){
        return width*height;
    }
    public double findPerimeter(){
        return (width+height)*2; 
    }
}
public class J04002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectange a = new Rectange();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();
        if(width<=0||height<=0){
            System.out.print("INVALID");
            return ;
        }
        a.setWidth(width);
        a.setHeight(height);
        a.setColor(color);
        System.out.print((long)a.findPerimeter() +" "+ (long)a.findArea() +" "+a.getColor().substring(0,1).toUpperCase() + a.getColor().substring(1).toLowerCase());
    }
}
