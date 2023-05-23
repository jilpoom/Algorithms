import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        
        for(int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }
           
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int lt = Integer.parseInt(st.nextToken()) - 1;
            int rt = Integer.parseInt(st.nextToken()) - 1;
            
            while(lt < rt) {
                int temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++;
                rt--;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i : arr) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
    }
}