import java.io.*;
import java.util.*;
public class Main{
    /**
     * 2023-01-04
     * @author JY
     * https://www.acmicpc.net/problem/15649
     * */

    public static int N;	// 정적변수로 변경
    public static int M;	// 정적변수로 변경
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정적변수 N과 M을 초기화해준다.
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];

        // 정적변수를 쓰면 되기 때문에 굳이 N과 M을 넘겨줄 필요 없다.
        dfs(0);
        System.out.println(sb);

    }

    public static void dfs(int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }


        for (int i = 0; i < N; i++) {

            // 해당 노드 값을 방문하지 않았다면?
            if (!visit[i]) {
                visit[i] = true; // 해당 노드를 방문 상태로 변경
                arr[depth] = i + 1; // 해당 깊이를 index로 하여 i + 1값을 저장
                dfs(depth + 1); // 다음 자식 노드 방문을 위해 depth 1 증가
                visit[i] = false; // 자식 노드 방문이 끝난 후, 돌아오면 방문 노드를 방문하지 않은 상태로 변경
            }
        }
    }








}