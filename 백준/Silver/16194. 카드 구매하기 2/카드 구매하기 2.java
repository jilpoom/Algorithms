import java.util.*;
import java.io.*;


public class Main {
    /**
     * Dynamic Programming
     * 2023-01-22
     *
     * @author JY
     * https://www.acmicpc.net/problem/16194
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

        for (int i = 1; i < N + 1; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        
        // 비교를 위해, int 자료형의 최대값을 초기화
        for(int i = 1; i <= N; i++){
            DP[i] = Integer.MAX_VALUE;
        }

        // P[i] : 카드 1장을 샀을 때, 카드 i - 1 개를 구입하는 최소값.
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                DP[i] = Math.min(DP[i], DP[i - j] + P[j]);
            }
        }

        System.out.println(DP[N]);

        bf.close();

    }


}