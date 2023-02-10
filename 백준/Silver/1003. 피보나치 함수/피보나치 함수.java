import java.math.BigInteger;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    /**
     * BruteFroce Algorithm
     * 2023-02-07
     *
     * @author JY
     * https://www.acmicpc.net/problem/1003
     */

    static int[] DP_zero;
    static int[] DP_one;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());

        DP_one = new int[42];
        DP_zero = new int[42];

        DP_zero[0] = 1;
        DP_one[0] = 0;
        DP_zero[1] = 0;
        DP_one[1] = 1;

        for(int i = 0; i < N; i++) {
            int answer = Integer.parseInt(bf.readLine());

            for(int j = 2; j <= answer; j++) {
                DP_zero[j] = DP_zero[j - 2] + DP_zero[j - 1];
                DP_one[j] = DP_one[j - 2] + DP_one[j - 1];
            }

            sb.append(DP_zero[answer] + " " + DP_one[answer] + "\n");

        }

        System.out.println(sb);

    }



}

