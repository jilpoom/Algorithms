class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int lcm = 0;
        
        
        if(denom1 != denom2) {
            lcm = denom1 * denom2;
            numer1 *= denom2;
            numer2 *= denom1;
        } else {
            lcm = denom1;
        }
        
        int answerNumer = numer1 + numer2;
        int answerDenom = lcm;
        
        int gcd = divide(answerNumer, answerDenom);
        
        answer[0] = answerNumer / gcd;
        answer[1] = answerDenom / gcd;
        
        
        return answer;
    }
    
    public int divide(int num1, int num2) {
        boolean isMax = num1 > num2 ? true : false;
        int result = 0;
        
        
        if(!isMax){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        
        int gcd = 0;
        
        while(gcd <= num2){
            gcd++;
            if(num1 % gcd == 0 && num2 % gcd == 0){
                result = gcd;
            }
        }
        
        return result;
        
    }
    
}