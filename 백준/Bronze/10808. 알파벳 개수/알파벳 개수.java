import java.util.*;
import java.io.*;


public class Main {
    /**
     * Data Structure
     * 2023-01-26
     *
     * @author JY
     * https://www.acmicpc.net/problem/2587
     */

    static int[] alpha;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] A = bf.readLine().toCharArray();
        alpha = new int[26];

        for(int i = 0; i < A.length; i++){
            alpha[A[i] - 97]++;
        }

        for(int i : alpha){
            System.out.print(i + " ");
        }

    }


}
