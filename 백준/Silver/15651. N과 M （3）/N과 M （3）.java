import java.util.*;
import java.io.*;


public class Main {
    /**
     * Dynamic Programming
     * 2023-01-12
     *
     * @author JY
     * https://www.acmicpc.net/problem/15651
     */

    static boolean[] visited;
    static int[] arr;
    static int N;
    static int M;

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        sb = new StringBuilder();

        int depth = 0;

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N];

        dps(depth);

        System.out.println(sb);


    }

    private static void dps(int depth) {
        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append("\n");
            return;
        }


        for (int i = 0; i < N; i++) {

            visited[i] = true;
            arr[depth] = i + 1;
            dps(depth + 1);
            visited[i] = false;


        }


    }


}

