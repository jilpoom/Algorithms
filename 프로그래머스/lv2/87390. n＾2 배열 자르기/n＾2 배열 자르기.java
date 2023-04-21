import java.util.*;

class Solution {
    /**
    * 1. 문제 이해하기
    * - 다음 주어진 조건에 맞는 1차원 배열을 반환하라.
    *    - n * n 의 배열을 선언한다.
    *    - 같은 번호의 행, 열에 해당하는 빈 칸을 해당 번호(i)로 채운다.
    *    - 모든 행을 잘라내고, 이어붙어 새로운 1차원 배열을 만든다.
    *    - 해당 1차원 배열의 범위(left ~ right) 범위의 배열을 반환한다.
    * 2. 제한 사항
    * - 1 <= n <= 1,000,000
    * - 0 <= left <= right < n^2
    * - right - left < 10,000
    */
    public int[] solution(int n, long left, long right) {
        int[] answer = {};
        
        // 3. 계획
         
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(long i = left; i <= right; i++) {
            int num = (int) (Math.max(i % n, i / n) + 1);
            list.add(num);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}