import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;
        int count = 1; // N값은 미리 세준다.

        // s
        // 1, 2, 3, 4, 5
        // e

        while(endIndex != N){ // end_Index가 15와 같지 않을 때까지,
            if(sum == N){ // 연속된 합을 찾았을 때
                count++; // count 증가
                endIndex++; // endPointer 증가
                sum += endIndex; // 현재 endPointer까지 합
            } else if (sum > N){ // 현재 총합이 N 보다 크다면
                sum -= startIndex; // 먼저 startIndex 빼줌
                startIndex++; // startIndex 증가
            } else if(sum < N) { // 현재 총합이 N보다 작다면
                endIndex++; // endPointer 증가
                sum += endIndex; // 증가한 endPointer를 합
            }
        }

        System.out.println(count);

    }

}

