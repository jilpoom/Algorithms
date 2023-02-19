import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    /**
     * Sort
     * 2023-02-18
     *
     * @author JY
     * https://www.acmicpc.net/problem/10815
     */

   static int N;
   static int M;
   static Map<Integer, Integer> map;


    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(stringTokenizer.nextToken());
        map = new HashMap<>();

        stringTokenizer = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++) {

            map.put(Integer.parseInt(stringTokenizer.nextToken()), 1);
        }

        stringTokenizer = new StringTokenizer(bf.readLine());
        M = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bf.readLine());
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());

            if(map.containsKey(num)) {
                sb.append(1 + " ");
            } else {
                sb.append(0 + " ");
            }
        }

        System.out.println(sb);

    }


}
