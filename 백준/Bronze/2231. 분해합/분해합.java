import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-07
     * @author JY
     * https://www.acmicpc.net/problem/2231
     */

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int result = 0;


        for(int i = 0; i < N; i++) {
            int number = i;
            int sum = 0;	// 각 자릿수 합 변수

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
            if(sum + i == N) {
                result = i;
                break;
            }

        }

        System.out.println(result);



    }


}
