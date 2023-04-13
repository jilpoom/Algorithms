import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int N, count;
    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0 , 1, 0};
    static int[][] board;

    public void DFS(int x, int y) {
        count++;
        board[x][y] = 0;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if(board[nx][ny] == 1) {
                    DFS(nx, ny);
                }
            }
        }

    }

    public String solution(int[][] board) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(board[i][j] == 1) {
                    count = 0;
                    DFS(i, j);
                    list.add(count);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");

        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }

        return sb.toString();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        board = new int[N][N];

        for(int i = 0; i < N; i++) {
            String[] str = bf.readLine().split("");
            for(int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(str[j]);
            }
        }

        Main main = new Main();

        System.out.println(main.solution(board));



    }
}


