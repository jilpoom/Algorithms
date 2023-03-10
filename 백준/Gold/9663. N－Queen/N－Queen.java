import java.math.BigInteger;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    /**
     * BruteFroce Algorithm
     * 2023-02-07
     *
     * @author JY
     * https://www.acmicpc.net/problem/9663
     */


    static int N;
    static int[] board;
    static int count = 0;

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt();
      board = new int[N];

      nQueen(0);

      System.out.println(count);


    }

    public static void nQueen(int depth) {
        // 행을 다 체우면 카운트를 1 증가시키고 리턴시킨다.
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            board[depth] = i;
            // Possibility() 해당 열에서 i 번째 행에 놓을 수 있는지를 검사하는 함수
            if (Possibility(depth)) {
                nQueen(depth + 1);
            }
        }
    }


    public static boolean Possibility(int col) {

        for (int i = 0; i < col; i++) {
            // 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우)
            if (board[col] == board[i]) {
                return false;
            }

            /*
             * 대각선상에 놓여있는 경우
             * (열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우다)
             */
            else if (Math.abs(col - i) == Math.abs(board[col] - board[i])) {
                return false;
            }
        }

        return true;
    }


}

