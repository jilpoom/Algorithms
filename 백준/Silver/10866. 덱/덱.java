import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-06
     * @author JY
     * https://www.acmicpc.net/problem/10866
     */

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        Deque<Integer> myDeque = new LinkedList<>();
        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(bf.readLine());
            String command = st.nextToken();

            switch (command){
                case "push_front":
                    int addFirstNum = Integer.parseInt(st.nextToken());
                    myDeque.addFirst(addFirstNum);
                    break;

                case "push_back":
                    int addLastNum = Integer.parseInt(st.nextToken());
                    myDeque.addLast(addLastNum);
                    break;

                case "pop_front":
                    if(myDeque.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(myDeque.pollFirst()).append("\n");
                    }
                    break;

                case "pop_back":
                    if(myDeque.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(myDeque.pollLast()).append("\n");
                    }
                    break;

                case "size":
                    sb.append(myDeque.size()).append("\n");
                    break;

                case "empty":
                    if(myDeque.isEmpty()){
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;

                case "front":
                    if(myDeque.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(myDeque.getFirst()).append("\n");
                    }
                    break;

                case "back":
                    if(myDeque.isEmpty()){
                        sb.append(-1).append("\n");
                    } else{
                        sb.append(myDeque.getLast()).append("\n");
                }
                    break;
            }


        }


        System.out.println(sb);

    }


}
