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
class Pair{
    private int x,y;
    public Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
public class J02009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new Pair(sc.nextInt(),sc.nextInt()));
        }
        arr.sort((p1,p2)->Integer.compare(p1.getX(), p2.getX()));
        int time = arr.get(0).getX();
        for(int i=0;i<n-1;i++){
            if(time+arr.get(i).getY()<arr.get(i+1).getX()){
                time = arr.get(i+1).getX();
            }
            else time = time + arr.get(i).getY();
        }
        System.out.print(time+arr.get(arr.size()-1).getY());
    }
}
