import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
     int[] answer = new int[numlist.length];

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(numlist[0]);

        for (int i = 1; i < numlist.length; i++) {

            int dis = Math.abs(n - numlist[i]); // n과 현재 값과의 거리
            int temp = Math.abs(n - stack1.peek()); // n과 stack 최상단과의 거리

            if (dis < temp) {
                stack1.add(numlist[i]);

                while (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }

            } else if (dis == temp) {
                if (numlist[i] >= stack1.peek()) {
                    stack1.push(numlist[i]);
                } else {
                    stack2.push(stack1.pop());
                    stack1.push(numlist[i]);
                    stack1.push(stack2.pop());
                }

                while (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }

            } else {
                // TODO : 최상단을 pop하고 stack2에 push 한 후, 다시 반복문 진행

                stack2.push(stack1.pop());

                if(stack1.size() == 0) {
                    stack1.push(numlist[i]);
                    while (!stack2.isEmpty()) {
                        stack1.push(stack2.pop());
                    }
                } else {
                    i--;
                }


            }


        }

        int index = 0;
        while (!stack1.isEmpty()) {
            answer[index++] = stack1.pop();
        }


        return answer;
    }
}