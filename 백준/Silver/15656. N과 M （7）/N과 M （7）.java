import java.util.*;
import java.io.*;


public class Main {
    /**
     * Dynamic Programming
     * 2023-01-13
     *
     * @author JY
     * https://www.acmicpc.net/problem/15654
     */

    static int[] arr;
    static int[] queArr;
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
        queArr = new int[N];

        st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < N; i++){
            queArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(queArr);

        dfs(depth);

        System.out.println(sb);



    }

    private static void dfs(int depth) {
        if (depth == M) {
            for(int i : arr){
                sb.append(i).append(' ');
            }
            sb.append('\n');

            return;
        }

        for(int i = 0; i < N; i++){ // start의 값을 증가시키면서 dfs, ->
                    arr[depth] = queArr[i];
                    dfs(depth + 1);
        }
    }


}

