import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    /**
     * Hash & Map
     * 2023-02-14
     *
     * @author JY
     * https://www.acmicpc.net/problem/1620
     */

    static int N;
    static int M;
    static Map<String, String> map = new HashMap<>();
    static String[] names;

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        names = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String line = bf.readLine();

            map.put(line, String.valueOf(i));
            names[i] = line;
        }


        for (int i = 0; i < M; i++) {
            String lines = bf.readLine();

            if (isNumeric(lines)) {
                int index = Integer.parseInt(lines);
                sb.append(names[index] + "\n");
            } else {
                sb.append(map.get(lines) + "\n");
            }

        }
        System.out.println(sb);
    }

    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}

