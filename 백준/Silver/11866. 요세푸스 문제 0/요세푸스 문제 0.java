import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-06
     * @author JY
     * https://www.acmicpc.net/problem/11866
     */

    static Queue<Integer> myQueue;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        myQueue = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            myQueue.add(i);
        }

        int flag = 0;

        while(!myQueue.isEmpty()){
            flag++;
            if(flag < K) {
                int last = myQueue.poll();
                myQueue.add(last);
            } else if (flag == K){
                int last = myQueue.poll();
                sb.append(last).append(", ");
                flag = 0;
            }

        }

        sb.delete(sb.length() - 2, sb.length() - 1);


        System.out.println("<" + sb.toString().trim() + ">");
    }


}

