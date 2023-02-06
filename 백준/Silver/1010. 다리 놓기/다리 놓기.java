import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    /**
     * DP
     * 2023-02-06
     *
     * @author JY
     * https://www.acmicpc.net/problem/25501
     */

    static int N;
    static BigInteger[] DP;

    static StringBuilder sb;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        DP = new BigInteger[32];
        DP[0] = new BigInteger("1");
        DP[1] = new BigInteger("1");

        for(int i = 2; i <= 30; i++){
            DP[i] = DP[i - 1].multiply(new BigInteger(Integer.toString(i)));
        }


        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            sb.append(DP[n].divide(DP[n - r].multiply(DP[r])) + "\n");
        }

        System.out.println(sb);
    }


}