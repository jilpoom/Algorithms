import java.math.BigInteger;
import java.rmi.server.ExportException;
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

    public static boolean[][] visited;
    public static int[][] arr;
    public static int M;
    public static int N;


    // DFS 함수 정의
    public static void dfs(int x, int y) {

        if(x < 0 || y < 0 || x >= M || y >= N){
            return;
        }

        if(!visited[x][y]) {
            visited[x][y] = true;
            if(arr[x][y] == 1) {
                dfs(x + 1, y);
                dfs(x, y + 1);
                dfs(x - 1, y);
                dfs(x, y - 1);
            }
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());
        for(int i = 0; i < T; i++) {
            int count = 0;
            st = new StringTokenizer(bf.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            arr = new int[M][N];
            visited = new boolean[M][N];

            for(int j = 0; j < K; j++) {
                st = new StringTokenizer(bf.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;
            }

            for(int j = 0; j < M; j++) {
                for(int k = 0; k < N; k++) {
                    if(arr[j][k] == 1 && !visited[j][k]) {
                        dfs(j, k);
                        count++;
                    }
                }
            }
            sb.append(count + "\n");
        }

    System.out.println(sb);

    }

}

