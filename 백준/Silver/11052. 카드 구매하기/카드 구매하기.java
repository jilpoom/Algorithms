import java.util.*;
import java.io.*;


public class Main {
    /**
     * Dynamic Programming
     * 2023-01-21
     *
     * @author JY
     * https://www.acmicpc.net/problem/11052
     */

    static int N;
    static int[] P;

    static int[] DP;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        P = new int[N + 1];
        DP = new int[N + 1];

        st = new StringTokenizer(bf.readLine());

        for(int i = 1; i < N + 1; i++){
            P[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                DP[i] = Math.max(DP[i], DP[i - j] + P[j]);
            }
        }

        System.out.println(DP[N]);

        bf.close();

    }




}