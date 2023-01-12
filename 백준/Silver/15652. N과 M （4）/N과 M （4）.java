import java.util.*;
import java.io.*;


public class Main {
    /**
     * Dynamic Programming
     * 2023-01-12
     *
     * @author JY
     * https://www.acmicpc.net/problem/15652
     */

    static int[] arr;
    static int N;
    static int M;
    static StringBuilder sb;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        sb = new StringBuilder();

        int depth = 0;
        int start = 1;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(start, depth);

        System.out.println(sb);



    }

    private static void dfs(int start, int depth) {
        if (depth == M) {
            for(int i : arr){
                sb.append(i).append(' ');
            }
            sb.append('\n');

            return;
        }

        for (int i = start; i <= N; i++){ // 
            arr[depth] = i;
            dfs(i, depth + 1);
        }


    }


}

