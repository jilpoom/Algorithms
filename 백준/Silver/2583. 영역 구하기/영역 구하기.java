import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    static int M, N, K;

    static int[][] board;
    static int count = 0;


    public void DFS(int x, int y) {
        board[x][y] = 1;
        count++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                if (board[nx][ny] == 0) {
                    DFS(nx, ny);
                }
            }
        }

    }

    public String solution(ArrayList<Pos> list) {

        for (int i = 0; i < list.size(); i += 2) {
            Pos pos = list.get(i);
            Pos pos2 = list.get(i + 1);

            for (int j = pos.y; j < pos2.y; j++) {
                for (int k = pos.x; k < pos2.x; k++) {
                    board[j][k] = 1;
                }
            }

        }

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    count = 0;
                    DFS(i, j);
                    answer.add(count);
                }
            }
        }

        Collections.sort(answer);
        StringBuilder sb = new StringBuilder();
        sb.append(answer.size()).append("\n");

        for(int i : answer) sb.append(i).append(" ");

        return sb.toString();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        ArrayList<Pos> posList = new ArrayList<>();
        board = new int[M][N];


        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(bf.readLine());
            Pos pos = new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            Pos pos2 = new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            posList.add(pos);
            posList.add(pos2);
        }

        Main main = new Main();

        System.out.println(main.solution(posList));


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


