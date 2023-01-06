import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-06
     *
     * @author JY
     * https://www.acmicpc.net/problem/10845
     */

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();


        Queue<Integer> myQueue = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());

        int last = 0;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(bf.readLine());
            String command = st.nextToken();

            if(command.equals("push")){
                int pushNumber = Integer.parseInt(st.nextToken());
                last = pushNumber;
                myQueue.add(pushNumber);
            } else if(command.equals("pop")){
                if(!myQueue.isEmpty()){
                    sb.append(myQueue.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if(command.equals("size")){
                sb.append(myQueue.size()).append("\n");
            } else if(command.equals("empty")){
                if(!myQueue.isEmpty()){
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
            } else if(command.equals("front")){
                if(!myQueue.isEmpty()){
                    sb.append(myQueue.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if(command.equals("back")){
                if(!myQueue.isEmpty()){
                    sb.append(last).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }


        }

        System.out.println(sb);

    }


}
