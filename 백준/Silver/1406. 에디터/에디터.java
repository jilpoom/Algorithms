import java.util.*;
import java.io.*;


public class Main {
    /**
     * Data Structure
     * Stack
     * 2023-01-16
     *
     * @author JY
     * https://www.acmicpc.net/problem/1406
     */

    static Stack<Character> myStack;
    static Stack<Character> saveStack;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        String line = st.nextToken();

        st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        myStack = new Stack<>();
        saveStack = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
            myStack.push(line.charAt(i));
        }

        for (int i = 0; i < N; i++) {
            // P x -> x를 커서 왼쪽에 입력 : Stack.push()
            // L : 커서를 왼쪽 한 칸으로 옮김 : Stack.pop() 이후 다른 저장소에 저장
            // D : 커서를 오른쪽 한 칸으로 옮김 : 저장소에 있던 명령어를 가져옮
            // B : Stack.pop() -> 이후 저장하지 않음.
            st = new StringTokenizer(bf.readLine());

            String command = st.nextToken();

            if (command.equals("L")) {
                if (!myStack.isEmpty()) {
                    saveStack.push(myStack.pop());
                }
            } else if (command.equals("D")) {
                if (!saveStack.isEmpty()) {
                    myStack.push(saveStack.pop());
                }
            } else if (command.equals("B")) {
                if (!myStack.isEmpty()) {
                    myStack.pop();
                }
            } else if (command.equals("P")) {
                char c = st.nextToken().charAt(0);
                myStack.push(c);
            }

        }

        while (!myStack.isEmpty()) {
            sb.append(myStack.pop());

        }
        sb.reverse();


        while (!saveStack.isEmpty()) {
            sb.append(saveStack.pop());
        }

        System.out.println(sb);

    }

}


