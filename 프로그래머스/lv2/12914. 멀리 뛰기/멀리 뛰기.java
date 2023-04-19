class Solution {
    // 1. 문제 이해하기
    // - 효진이는 한 번에 1칸 or 2칸을 뛸 수 있다.
    // - 맨 끝칸에 도달할 수 있는 방법의 수를 찾아라.
    // 2. 제한사항
    // - 1 <= n <= 2000
    
    public long solution(int n) {
        // 3. 계획
        // Dynamic Programming 문제이다.
        // DP[i] : 해당 칸까지 도달할 수 있는 경우의 수
        // DP[i] = DP[i - 2] + DP[i - 1]을 만족한다. (마지막 칸에 도달하기 직전은 2칸 전, 1칸 전 뿐이다.)
        
        long[] DP = new long[n + 1]; // n의 수가 크지 않으므로, 다음과 같이 선언한다.
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        DP[1] = 1;
        DP[2] = 2;
        
        for(int i = 3; i <= n; i++) {
            DP[i] = (DP[i - 1] + DP[i - 2]) % 1234567L;
        }
        
        return DP[n];
    }
}