import java.io.*;
import java.util.*;
public class Main{
    /**
     * 2023-01-04
     * @author JY
     * @site https://www.acmicpc.net/problem/1463
     * */

        static int[] F;

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            F = new int[1000005];

            int N = sc.nextInt();

            F[1] = 0;

            for(int i = 2; i <= N; i++){
                F[i] = F[i - 1] + 1;
                if(i % 2 == 0) F[i] = Math.min(F[i], F[i/2] + 1);
                if(i % 3 == 0) F[i] = Math.min(F[i], F[i/3] + 1);
            }
            System.out.println(F[N]);

        }






}