import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();

//        0 0 0 0 0
//        0 0 1 0 3
//        0 2 5 0 1
//        4 2 4 4 2
//        3 5 1 3 1
//        1 5 3 5 1 2 1 4
        // moves 가 반복, j

        // 4, 3,

        int count = 0;
        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                int target = board[j][moves[i] - 1];

                if(!stack.isEmpty() && stack.peek() == target) {
                    count++;
                    board[j][moves[i] - 1] = 0;
                    stack.pop();
                    break;
                }

                if(target != 0) {
                    stack.push(target);
                    board[j][moves[i] - 1] = 0;
                    break;
                }


            }

        }
        return count * 2;
    }
}