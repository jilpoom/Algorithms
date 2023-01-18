import javax.swing.plaf.ButtonUI;
import java.util.*;
import java.io.*;


public class Main {
    /**
     * Data Structure
     * Stack
     * 2023-01-18
     *
     * @author JY
     * https://www.acmicpc.net/problem/10799
     */

    static Stack<Character> stack;

    public static void main(String args[]) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();

        int count = 0;
        stack = new Stack<>();


        for(int i = 0; i < line.length(); i++){
            char c = line.charAt(i);

            if(c == '('){
                stack.push(c);
                continue;
            }
            if(c == ')'){
                stack.pop();

                if(line.charAt(i - 1) == '('){
                    count += stack.size();
                } else {
                    count++;
                }

            }

        }

            System.out.println(count);

    }


}


