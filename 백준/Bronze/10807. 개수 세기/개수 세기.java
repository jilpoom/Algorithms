import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/10807
     */


    public static int[] A;
    public static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());

        A = new int[N];

        st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine());

        int v = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            if(A[i] == v) ans++;
        }

        System.out.println(ans);

    }



}