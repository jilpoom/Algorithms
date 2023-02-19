import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

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

    static HashMap<String, Integer> map;
    static ArrayList<String> arr;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new HashMap<>();
        arr = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            String s = bf.readLine();

            map.put(s, 0);
        }

        int count = 0;



        for(int i = 0; i < M; i++) {
            String s = bf.readLine();

            if(map.containsKey(s)) {
             count++;
             arr.add(s);
            }
        }

        Collections.sort(arr);

        sb.append(count + "\n");

        for(String s : arr) {
            sb.append(s + "\n");
        }

        System.out.println(sb);
    }





}
