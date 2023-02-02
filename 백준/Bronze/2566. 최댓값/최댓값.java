import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    /**
     * BruteForce
     * 2023-02-02
     *
     * @author JY
     * https://www.acmicpc.net/problem/4375
     */

    static StringTokenizer st;
    static int[][] numArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        numArray = new int[9][9];

        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(bf.readLine());

            for (int j = 0; j < 9; j++) {
                numArray[i][j] = Integer.parseInt(st.nextToken());
                if (max < numArray[i][j]) {
                    max = numArray[i][j];
                }
            }

        }

        outer : for(int i = 0; i < 9; i++){

            for(int j = 0; j < 9; j++){
                if(max == numArray[i][j]){
                    x = i + 1;
                    y = j + 1;

                    break outer;
                }

            }
        }

        System.out.println(max);
        System.out.print(x + " " + y);

    }


}
