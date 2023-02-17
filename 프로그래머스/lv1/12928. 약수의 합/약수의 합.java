class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            answer += Divisor(n, i);
        }
        
        return answer;
    }
    
    public int Divisor(int n, int m) {
        return n % m == 0 ? m : 0;
    }
}