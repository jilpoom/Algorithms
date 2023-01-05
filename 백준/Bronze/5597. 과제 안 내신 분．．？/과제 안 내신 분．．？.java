import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/5597
     */


    static boolean[] A;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        A = new boolean[31];

        for(int i = 1; i <= 28; i++){
            int present = sc.nextInt();
            A[present] = true;
        }

        String result = "";

        for(int i = 1; i < A.length; i++){
            if(A[i] == false){
                result += i + "\n";
            }
        }

        System.out.println(result);

    }



}