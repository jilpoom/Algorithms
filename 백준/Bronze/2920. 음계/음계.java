import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/2920
     * */


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] A = new int[8];


        for(int i = 0; i < 8; i++){
            A[i] += Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < 8; i++){
           int diff = Math.abs(A[i] - A[i - 1]);
           if(diff >= 2){
               System.out.println("mixed");
               return;
           }
        }

        if(A[0] == 8){
            System.out.println("descending");
        } else if(A[0] == 1){
            System.out.println("ascending");
        }

    }




}