class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            int count = countDivisor(i);
            if(count > limit) count = power;
            answer += count;
        }
        
        
        return answer;
    }
    
    public int countDivisor(int number) {
        int count = 0;
        int i;
        for(i = 1; i < Math.sqrt(number); i++) {
            if(number % i == 0) count += 2;
        }
        
        if(i * i == number) count++;
        
        return count;
    }
}