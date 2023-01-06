import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-06
     * @author JY
     * https://www.acmicpc.net/problem/11650
     */


    static Node[] arr;
    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        arr = new Node[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Node(x, y);
        }

        Arrays.sort(arr);

        for(Node n : arr){
            sb.append(n.toString()).append("\n");
        }

        System.out.println(sb);
    }

   static class Node implements Comparable<Node>{
        int x;
        int y;

        Node(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
       public int compareTo(Node o){
            if(this.x == o.x){
                return this.y - o.y;
            }

            return this.x - o.x;
        }

        public String toString(){
            return this.x + " " + this.y;
        }

    }

}
