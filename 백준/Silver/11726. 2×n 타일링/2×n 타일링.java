import java.util.*;
import java.io.*;


public class Main {
    /**
     * Dynamic Programming
     * 2023-01-20
     *
     * @author JY
     * https://www.acmicpc.net/problem/11726
     */


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] DP = new int[n + 2];
        DP[1] = 1;
        DP[2] = 2;
        for (int i = 3; i <= n; i++) {
            DP[i] = (DP[i - 1] + DP[i - 2]) % 10007;
        }
        System.out.println(DP[n] % 10007);


    }

}