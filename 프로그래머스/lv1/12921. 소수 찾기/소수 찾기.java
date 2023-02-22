class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];
        
        isPrime[0] = isPrime[1] = true; // 0, 1 소수가 아니므로 제외
        
        for(int i = 2 ; i * i <= n; i++) {
            
            if(!isPrime[i]){
                for(int j = i * i; j <= n; j += i) {
                    isPrime[j] = true;
                }
            }
            
        }
        
        int answer = 0;
        
        for(int i = 0; i <= n; i++) {
            if(!isPrime[i]) {
                answer++;
            }
        }
        
        return answer;
    }
}