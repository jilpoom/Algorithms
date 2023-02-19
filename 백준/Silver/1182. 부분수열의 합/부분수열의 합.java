import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /**
     * Sort
     * 2023-02-18
     *
     * @author JY
     * https://www.acmicpc.net/problem/10815
     */

   static int N;
   static int S;
   static boolean[] visited;
   static int count;
   static int[] arr;


    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        S = Integer.parseInt(stringTokenizer.nextToken());

        visited = new boolean[N];
        arr = new int[N];

        stringTokenizer = new StringTokenizer(bf.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        DFS(0, 0);

        System.out.println(S == 0 ? count - 1 : count);

    }

    private static void DFS(int depth, int sum) {
        if (depth == N) {
            if (sum == S) count++;
            return;
        }

        DFS(depth + 1, sum + arr[depth]);
        DFS(depth + 1, sum);
    }

}
