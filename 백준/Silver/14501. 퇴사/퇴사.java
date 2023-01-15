import java.util.*;
import java.io.*;


public class Main {
    /**
     * Dynamic Programming
     * BruteForce Algorithm
     * 2023-01-15
     *
     * @author JY
     * https://www.acmicpc.net/problem/14501
     */

    static int N;
    static int[] T;
    static int[] P;
    static int ans = Integer.MIN_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());

        T = new int[N];
        P = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        searchMax(0, 0);

        System.out.println(ans);


    }

    public static void searchMax(int Tcount, int sum) {
        // TODO: 해당 날이 퇴사한 날인 경우
        if (Tcount == N) {
            if (ans < sum) {
                ans = sum;
            }
            return;
        }

        // TODO: 해당 날이 퇴사한 날을 넘어가는 경우
        if (Tcount > N) return;

        // TODO: 다음 날짜와 해당 보상을 더해준다.
        searchMax(Tcount + T[Tcount], sum + P[Tcount]);

        // TODO: 일을 하는 경우는 하루만 지나간다.
        searchMax(Tcount + 1, sum);


    }


}
