class Solution {
    public int solution(int num) {
        int count = 0;
        int answer = -1;
        
        if(num == 1) {
            return 0;
        }
        
        while(count <= 500) {
            
            if(num == 1) {
                answer = count;
                break;
            }
            
            if(num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                num *= 3;
                num += 1;
            }
            
            count++;
        }
        
        
        return answer;
    }
    
}