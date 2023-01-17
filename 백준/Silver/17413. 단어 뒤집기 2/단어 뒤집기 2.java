import java.util.*;
import java.io.*;


public class Main {
    /**
     * Data Structure
     * Stack
     * 2023-01-17
     *
     * @author JY
     * https://www.acmicpc.net/problem/17413
     */


//    알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
//    문자열의 시작과 끝은 공백이 아니다.
//    '<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.


    static Stack<Character> myStack;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        boolean flag = false;

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                flag = true;
            } else if (str.charAt(i) == '>') {
                flag = false;
                sb.append(str.charAt(i));
                continue;
            }

            if (flag == true) {
                sb.append(str.charAt(i));
            } else if (flag == false) {

                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    stack.push(str.charAt(i));
                }
            }


            if (i == str.length() - 1) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }

        // 결과문 출력
        System.out.println(sb);
    }


}


