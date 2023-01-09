import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-09
     * @author JY
     * https://www.acmicpc.net/problem/10773
     */


    static Stack<Integer> stack;
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(bf.readLine());

        stack = new Stack<>();

        for(int i = 0; i < K; i++){
            int num = Integer.parseInt(bf.readLine());

            if(num == 0){
                stack.pop();
            } else {
                stack.add(num);
            }
        }

        int sum = 0;

        if(!stack.isEmpty()) {
            while(!stack.isEmpty()){
                sum += stack.pop();
            }
            System.out.println(sum);
        } else {
            System.out.println(0);
        }

    }


}
