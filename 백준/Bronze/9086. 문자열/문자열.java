import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/9086
     * */


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i++){
            String line = bf.readLine();
            String result = line.charAt(0) + "" + line.charAt(line.length() - 1);

            System.out.println(result);
        }

    }



}