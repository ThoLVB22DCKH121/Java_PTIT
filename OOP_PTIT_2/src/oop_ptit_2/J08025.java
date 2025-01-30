/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ptit_2;

/**
 *
 * @author LE VAN THO
 */
import java.util.*;
public class J08025 {
    public static void quaytrai(int[][] a, int[][] b){
       b[1][1] = a[2][1];
       b[1][2] = a[1][1];
       b[2][1] = a[2][2];
       b[2][2] = a[1][2];
    }
    public static void quayphai(int[][] a, int[][] b){
        b[1][2] = a[2][2];
        b[1][3] = a[1][2];
        b[2][2] = a[2][3];
        b[2][3] = a[1][3];
    }
    public static boolean check(int[][] a, int[][] b){
        for(int i=1;i<=2;i++){
            for(int j=1;j<=3;j++){
                if(a[i][j]!=b[i][j])return false;
            }
        }
        return true;
    }
    public static String chuanhoa(int[][] a){
        String s = "";
        for(int i=1;i<=2;i++){
            for(int j=1;j<=3;j++){
                s += Integer.toString(a[i][j])+" ";
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            Queue<int[][]> q = new LinkedList<>();
            Set<String> st = new HashSet<>();
            int[][] a = new int[4][4];
            int[][] b = new int[4][4];
            int cnt = 0;
            a[0][0]=0;
            for(int i=1;i<=2;i++){
                for(int j=1;j<=3;j++)a[i][j] = sc.nextInt();
            }
            for(int i=1;i<=2;i++){
                for(int j=1;j<=3;j++)b[i][j] = sc.nextInt();
            }
            if(check(a,b)){
                System.out.println("0");
                continue;
            }
            q.add(a);
            st.add(chuanhoa(a));
            while (!q.isEmpty()) {
                int[][] s = q.remove();
                if (check(s, b)) {
                    cnt = s[0][0];
                    break;
                }
                // Tạo ma trận mới cho mỗi phép xoay
                int[][] c1 = new int[4][4];
                int[][] c2 = new int[4][4];
                for(int i=1;i<=2;i++){
                    for(int j=1;j<=3;j++){
                        c1[i][j] = s[i][j];
                        c2[i][j] = s[i][j];
                    }
                }
                // Quay trái
                quaytrai(s, c1);
                if (!st.contains(chuanhoa(c1))) {
                    c1[0][0] = s[0][0]+1;
                    st.add(chuanhoa(c1));
                    q.add(c1);
                }

                // Quay phải
                quayphai(s, c2);
                if (!st.contains(chuanhoa(c2))) {
                    c2[0][0] = s[0][0]+1;
                    st.add(chuanhoa(c2));
                    q.add(c2);
                }
            }
            System.out.println(cnt);
        }
    }
}
/*
1
1 2 3 4 5 6
4 1 2 6 5 3
*/