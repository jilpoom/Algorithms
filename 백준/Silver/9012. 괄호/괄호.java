import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/9012
     */


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            System.out.println(test(sc.next()));
        }

    }

    static String test(String line){
        Stack<Character> myStack = new Stack<>();

        for(int i = 0; i < line.length(); i++){
            char c = line.charAt(i);

            if (c == '(') {
                myStack.push('(');
            } else if(myStack.isEmpty()){
                return "NO";
            } else {
                myStack.pop();
            }

        }

        if(myStack.isEmpty()){
            return "YES";
        } else {
            return "NO";
        }

    }

}
