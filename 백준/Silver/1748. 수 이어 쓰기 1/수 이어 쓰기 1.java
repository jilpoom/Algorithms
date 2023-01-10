import java.util.*;
import java.io.*;


public class Main
{
    /**
     * BruteForce Algorithm
     * 2023-01-10
     *
     * @author JY
     * https://www.acmicpc.net/problem/1748
     */

    // 1 <= N <= 100,000,000
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;	// 자릿수
        int plus = 1;	// 자릿수에 더하는 값
        int num = 10;	// 몇 자릿수 더할지 판단
        int N = Integer.parseInt(bf.readLine());
        for(int i = 1; i <= N; i++) {
            if(i % num == 0) {
                plus++;
                num *= 10;
            }
            count += plus;

        }
        System.out.println(count);
        bf.close();
    }


}

