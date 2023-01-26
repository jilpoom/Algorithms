import java.util.*;
import java.io.*;


public class Main {
    /**
     * Dynamic Programming
     * 2023-01-26
     *
     * @author JY
     * https://www.acmicpc.net/problem/2587
     */

    static int[] arr;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);

        System.out.println(sum / 5);
        System.out.println(arr[2]);

    }


}