import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    int[] check = new int[26];
    static int[][] boardCheck;
    boolean flag = false;
    static int R, C, count, answer;
    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0 , 1, 0};
    static char[][] board;

    public void DFS(int x, int y, int count) {

        if(check[board[x][y] - 'A'] == 1) {
            answer = Math.max(answer, count);

        } else {
            check[board[x][y] - 'A']++;
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < R && ny < C) {
                    DFS(nx, ny, count + 1);
                }
            }
            check[board[x][y] - 'A']--;
        }

    }

    public int solution(char[][] board) {
        answer = 0;
        DFS(0, 0, 0);

        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        board = new char[R][C];
        boardCheck = new int[R][C];

        for(int i = 0; i < R; i++) {
            char[] str = bf.readLine().toCharArray();
            for(int j = 0; j < C; j++) {
                board[i][j] = str[j];
            }
        }

        Main main = new Main();

        System.out.println(main.solution(board));



    }
}

class Pos {
    int x;
    int y;

    Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


