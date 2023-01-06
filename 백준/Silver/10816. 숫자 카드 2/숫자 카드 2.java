import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/10816
     */


    static HashMap<Integer, Integer> cards;


    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        cards = new HashMap<>();

        st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < N; i++){

            int number = Integer.parseInt(st.nextToken());

            if(cards.containsKey(number)){
                int count = cards.get(number);
                cards.put(number, count + 1);
            } else {
                cards.put(number, 1);
            }

        }

        st = new StringTokenizer(bf.readLine());

        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        for(int i = 0 ; i < M; i++){
           int searchNum = Integer.parseInt(st.nextToken());
           int searchCount = cards.getOrDefault(searchNum, 0);
           sb.append(searchCount).append(" ");
        }

        System.out.println(sb);
    }


}
