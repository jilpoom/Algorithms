import java.io.*;
import java.util.*;
public class Main{

    static ArrayList<Integer>[] A;
    static boolean visited[];


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int startV = Integer.parseInt(st.nextToken());

        A = new ArrayList[N + 1];


        for(int i = 0; i < N + 1; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(bf.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        for(int i = 1; i <= N; i++){
            Collections.sort(A[i]);
        }

        visited = new boolean[N + 1];
        DFS(startV);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(startV);
        System.out.println();
    }


    static void DFS(int v){
        System.out.print(v + " ");
        visited[v] = true;

        for(int i : A[v]){
            if(visited[i] == false){
                DFS(i);
            }
        }

    }

    static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()){
            int now_Node = queue.poll();
            System.out.print(now_Node + " ");
            for(int i : A[now_Node]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }


}