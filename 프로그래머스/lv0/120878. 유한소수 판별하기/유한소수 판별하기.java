class Solution {
    public int solution(int a, int b) {
        int gcd = GCD(a, b);
        
        a /= gcd;
        b /= gcd;
        
        int count = 2;
        
        int answer = 1;
        
        while(b > 1) {
            
            if(b % 2 == 0) {
                b /= 2;    
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                answer = 2;
                break;
            }
        }
        
        
        return answer;
    }

    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0)  return num2;
        
        return GCD(num2, num1 % num2);
    }
}