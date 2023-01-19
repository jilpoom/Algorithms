import javax.swing.plaf.ButtonUI;
import java.util.*;
import java.io.*;


public class Main {
    /**
     * Data Structure
     * Stack
     * 2023-01-19
     *
     * @author JY
     * https://www.acmicpc.net/problem/1935
     */

    static Stack<Double> myStack;
    static double[] arr;


    public static void main(String args[]) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String line = bf.readLine();

        myStack = new Stack<>();
        arr = new double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        double result = 0;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                myStack.push(arr[c - 'A']);
            } else {
                if (!myStack.isEmpty()) {
                    double operand1 = myStack.pop();
                    double operand2 = myStack.pop();

                    switch (c) {
                        case '*':
                            result = operand2 * operand1;
                            myStack.push(result);
                            continue;
                        case '/':
                            result = operand2 / operand1;
                            myStack.push(result);
                            continue;
                        case '+':
                            result = operand2 + operand1;
                            myStack.push(result);
                            continue;
                        case '-':
                            result = operand2 - operand1;
                            myStack.push(result);
                            continue;
                    }

                }
            }

        }

        System.out.printf("%.2f", myStack.pop());

    }


}


