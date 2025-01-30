
/**
 *
 * @author LE VAN THO
 */
import java.util.*;

class Point{
    private double x,y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc){
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return new Point(x,y);
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
    }
}

class Triangle{
    private Point p1,p2,p3;
    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public boolean valid(){
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        if(a+b<=c || a+c<=b || b+c<=a){
            return false;
        }
        else return true;
    }
    public String getPerimeter(){
        return String.format("%.3f",p1.distance(p2)+p2.distance(p3)+p3.distance(p1));
    }
}

public class J04019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
