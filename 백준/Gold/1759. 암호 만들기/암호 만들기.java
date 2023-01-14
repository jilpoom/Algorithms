import java.util.*;
import java.io.*;


public class Main {
    /**
     * BackTracking
     * 2023-01-14
     *
     * @author JY
     * https://www.acmicpc.net/problem/1759
     */

    static int L;
    static int C;
    static char[] queArr;

    static boolean[] visited;

    static StringBuilder sb;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        sb = new StringBuilder();
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());

        queArr = new char[C];
        visited = new boolean[C];

        for (int i = 0; i < C; i++) {
            queArr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(queArr);

        int start = 0;
        int depth = 0;

        dfs(start, depth);


    }

    static void dfs(int start, int cnt) {
        if (cnt == L) {
            int v = 0;
            int cc = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < C; i++) {
                if (visited[i]) {
                    sb.append(queArr[i]);

                    if (queArr[i] == 'a' || queArr[i] == 'e' || queArr[i] == 'i' || queArr[i] == 'o' || queArr[i] == 'u') {
                        v++;
                    } else {
                        cc++;
                    }
                }
            }
            if (v >= 1 && cc >= 2) System.out.println(sb);

        }
        //백트래킹
        for (int i = start; i < C; i++) {
            visited[i] = true;
            dfs(i + 1, cnt + 1);
            visited[i] = false;
        }
    }


}




