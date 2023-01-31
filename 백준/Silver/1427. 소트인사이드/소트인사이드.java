import java.util.*;
import java.io.*;


public class Main {
    /**
     * Sort
     * 2023-01-31
     *
     * @author JY
     * https://www.acmicpc.net/problem/1427
     */

    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split("");
        sb = new StringBuilder();
        arr = new int[line.length];

        for(int i = 0; i < line.length; i++){
            arr[i] = Integer.parseInt(line[i]);
        }

        Arrays.sort(arr);

        for(int i : arr){
            sb.append(i);
        }
        sb.reverse();
        System.out.println(sb);

    }


}
