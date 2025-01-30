/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
class Matrix{
    private int n,m;
    private int[][] a;
    public Matrix(int[][] a,int n,int m){
        this.n = n;
        this.m = m;
        this.a = a;
    }
    public Matrix(int n,int m){
        this.n = n;
        this.m = m;
    }
    public void nextMatrix(Scanner sc) {
        this.a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.a[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix mul(Matrix b){
        int[][] mx = b.a;
        int[][] c = new int[n][b.m];
        for(int i=0;i<n;i++){
            for(int j=0;j<b.m;j++){
                int sum = 0;
                for(int k=0;k<m;k++){
                    sum += a[i][k]*mx[k][j];
                }
                c[i][j] = sum;
            }
        }
        Matrix e = new Matrix(c,n,b.m);
        return e;
    }
     public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(Integer.toString(a[i][j])).append(" ");
            }
            sb.append("\n"); // Thêm dòng mới sau mỗi hàng
        }
        return sb.toString();
    }
}
public class J04016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
