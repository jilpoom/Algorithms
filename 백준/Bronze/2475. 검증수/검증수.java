import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/15964
     * */


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int result = 0;

        for(int i = 0; i < 5; i++){
            result += (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
        }

        System.out.println(result % 10);
    }




}