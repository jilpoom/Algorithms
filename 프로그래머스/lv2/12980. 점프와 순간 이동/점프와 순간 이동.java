import java.util.*;

public class Solution {
    
    /**
    * 1. 문제 이해하기
    * - 아이언 슈트의 기능
    *   - K 칸 이동 : 건전지 소모
    *   - (현재 거리) * 2 순간 이동 : 건전지 소모 X (더 효율적)
    * - 이동 거리 N이 주어졌을 때, 건전지 사용량 최솟값을 출력
    * 1 - 1. 이동 방법
    * - N = 5
    *    1. [5(5)] -> result : 5
    *    2. [2(2), 4, 5(1)] -> result : 3
    *    3. [1(1), 2, 4, 5(1)] -> result : 2
    * - N = 6
    *    1. [1(1), 2, 3(1), 6] -> result : 2
    * 2. 제한 사항
    * - 1 <= N <= 1,000,000,000
    * - K >= 1
    */
    
    public int solution(int n) {
        int ans = 0;
        // 3. 계획 (메모리 부족)
        // - 입력이 1,000,000,000 이하로 주어 질 수 있으므로 단순 반복문으로 풀 수 없다.
        // - Dynamic Programming 기법을 사용한다.
        // - DP[n] 가 최소 건전지 사용량 일 때,
        // - n이 짝수 인 경우 DP[n] = DP[n / 2] 가 성립한다.
        // - n이 홀수 인 경우 DP[n] = DP[n / 2] + 1 이 성립한다.
        
        /**
        int[] DP = new int[n + 1];
        DP[1] = 1;
        DP[2] = 1;
        
        for(int i = 3; i <= n; i++) {
            if(i % 2 == 0) {
                DP[i] = DP[i / 2];
            } else {
                DP[i] = DP[i / 2] + 1;
            }
        }
        */
        
        // 3.계획 비트 수 세기 활용
        
        return Integer.bitCount(n);
    }
}