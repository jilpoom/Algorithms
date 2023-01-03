import java.io.*;
import java.util.*;
public class Main{

    static ArrayList<Integer>[] A;
    static boolean visited[];


    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for(int i = 0; i <n + 1; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(bf.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e); // 방향성이 없으므로, 양 쪽 노드에 모두 연결되어 있는 형태
            A[e].add(s);
        }

        int count = 0;

        for (int i = 1; i < n + 1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }

        }

        System.out.println(count);

    }

    static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : A[v]){
            if(visited[i] == false){
                DFS(i);
            }
        }
    }

}
