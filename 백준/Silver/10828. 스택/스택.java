import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/10828
     */

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();


        Stack<Integer> myStack = new Stack<>();

        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(bf.readLine());
            String command = st.nextToken();

            if(command.startsWith("push")){
                int pushNum = Integer.parseInt(st.nextToken());
                myStack.push(pushNum);
            } else if(command.equals("pop")){
                if(!myStack.isEmpty()){
                    sb.append(myStack.pop()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if(command.equals("top")){
                if(!myStack.isEmpty()){
                    sb.append(myStack.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if(command.equals("size")){
                sb.append(myStack.size()).append("\n");
            } else if(command.equals("empty")){
                if(!myStack.isEmpty()){
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
            }
        }

        System.out.println(sb);

    }


}
