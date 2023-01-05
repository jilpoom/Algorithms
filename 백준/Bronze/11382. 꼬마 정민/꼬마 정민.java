import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/25083
     */



    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long result = 0;

        for(int i = 0; i < 3; i ++){
            long a = Long.parseLong(st.nextToken());
            result += a;

        }

        System.out.println(result);



    }



}