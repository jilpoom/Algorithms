import java.util.*;
import java.io.*;


public class Main {
    /**
     * Dynamic Programming
     * 2023-01-12
     *
     * @author JY
     * https://www.acmicpc.net/problem/15654
     */

    static int[] arr;
    static int[] queArr;
    static boolean[] visited;
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
        queArr = new int[N];
        visited = new boolean[N];

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


        for(int i = 0; i < queArr.length; i++){ // queArr의 길이만큼 반복
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = queArr[i]; // depth를 인덱스로 하여 정렬된 queArr[i]를 arr에 초기화
                dfs(depth + 1);
                visited[i] = false;
            }

        }



    }


}

