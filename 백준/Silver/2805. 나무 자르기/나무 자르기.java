import java.util.*;
import java.io.*;


public class Main {
    /**
     * Dynamic Programming
     * 2023-01-20
     *
     * @author JY
     * https://www.acmicpc.net/problem/2805
     */

    static int A[];

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        A = new int[N];

        st = new StringTokenizer(bf.readLine());
        int maxRod = 0;
        int minRod = 0;
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());

            if (maxRod < A[i]) {
                maxRod = A[i];
            }
        }


        while(minRod < maxRod){
            int mid = (minRod + maxRod) / 2;
            long sum = 0;

            for(int tree : A){

                if(tree - mid > 0){
                    sum += tree - mid;
                }
            }

            if(sum < M){
                maxRod = mid;
            }


            else {
                minRod = mid + 1;
            }
        }

        System.out.println(minRod - 1);

    }




}