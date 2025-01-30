/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
class Point3D{
    private short x,y,z;

    public Point3D(int x, int y, int z){
        this.x = (short)x;
        this.y = (short)y;
        this.z = (short)z;
    }
    
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        short[][] m = new short[5][5];
        m[1][4] = m[2][4] = m[3][4] = m[4][4] = 1;
        m[1][1] = (short) p1.x;
        m[1][2] = (short) p1.y;
        m[1][3] = (short) p1.z;
        m[2][1] = (short) p2.x;
        m[2][2] = (short) p2.y;
        m[2][3] = (short) p2.z;
        m[3][1] = (short) p3.x;
        m[3][2] = (short) p3.y;
        m[3][3] = (short) p3.z;
        m[4][1] = (short) p4.x;
        m[4][2] = (short) p4.y;
        m[4][3] = (short) p4.z;
        int sum = 0;
        sum += m[1][1]*(m[2][2]*m[3][3]+m[4][2]*m[2][3]+m[3][2]*m[4][3]-m[4][2]*m[3][3]-m[3][2]*m[2][3]-m[2][2]*m[4][3]);
        sum -= m[1][2]*(m[2][1]*m[3][3]+m[4][1]*m[2][3]+m[3][1]*m[4][3]-m[4][1]*m[3][3]-m[3][1]*m[2][3]-m[2][1]*m[4][3]);
        sum += m[1][3]*(m[2][1]*m[3][2]+m[4][1]*m[2][2]+m[3][1]*m[4][2]-m[4][1]*m[3][2]-m[3][1]*m[2][2]-m[2][1]*m[4][2]);
        sum -= (m[2][1]*m[3][2]*m[4][3]+m[4][1]*m[2][2]*m[3][3]+m[3][1]*m[4][2]*m[2][3]-m[4][1]*m[3][2]*m[2][3]-m[3][1]*m[2][2]*m[4][3]-m[2][1]*m[4][2]*m[3][3]);
        if(sum == 0)return true;
        else return false;
    }
}

public class J04011 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
