import java.util.*;
import java.io.*;


public class Main
{
    /**
     * Dynamic Programming
     * 2023-01-11
     *
     * @author JY
     * https://www.acmicpc.net/problem/9095
     */

    static int[] DP;
    
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        DP = new int[11];

        DP[1] = 1;
        DP[2] = 2;
        DP[3] = 4;

        for(int i = 4; i < 11; i++){
            DP[i] = DP[i - 3] + DP[i - 2] + DP[i - 1];
        }

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(bf.readLine());
            System.out.println(DP[N]);

        }

    }


}

