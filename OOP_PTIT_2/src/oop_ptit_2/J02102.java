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
public class J02102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n*n;i++)arr.add(sc.nextInt());
        arr.sort((s1,s2)->Integer.compare(s1, s2));
        int c1 = 0, c2 = n-1, h1 = 0, h2 = n-1, cnt = 0;
        int[][] res = new int[n][n];
        while(c1<=c2&&h1<=h2){
            for(int i=c1;i<=c2;i++){
                res[h1][i] = arr.get(cnt);
                cnt++;
            }
            h1++;
            for(int i=h1;i<=h2;i++){
                res[i][c2] = arr.get(cnt);
                cnt++;
            }
            c2--;
            for(int i=c2;i>=c1;i--){
                res[h2][i] = arr.get(cnt);
                cnt++;
            }
            h2--;
            for(int i=h2;i>=h1;i--){
                res[i][c1] = arr.get(cnt);
                cnt++;
            }
            c1++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
3
3 6 1
8 7 9
4 12 5
*/
