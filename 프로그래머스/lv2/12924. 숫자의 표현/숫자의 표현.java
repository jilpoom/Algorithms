class Solution {
    /**
    * 1. 문제 이해하기
    * - 자연수 n을 연속한 자연수들로 표현하는 방법의 개수를 반환한다.
    * 1 - 1 제한 사항
    * - 1 <= n <= 10,000
    */
    
    public int solution(int n) {
        int answer = 0;
        
        // 2. 계획하기 
        // 2 - 1 1부터 n까지 반복하면서, 합이 15가 되는 것을 찾을 때마다 카운팅한다. (O(n^2))
        // 2 - 2 단, n / 2 + 1를 넘어가는 모든 합에 대해서는 n을 조합할 수 없다. n만 카운팅 한다.
        // 2 - 3 15를 찾을 때마다 count 한다.
        int count = 0;
        for(int i = 1; i <= n / 2; i++) {
            int sum = 0;
            for(int j = i; j <= (n / 2) + 1; j++) {
                sum += j;
                if(sum > n) break;
                else if(sum == n) count++;
                
            }
        }
        
        // 마지막 n 개수 더하기
        
        return count + 1;
    }
}