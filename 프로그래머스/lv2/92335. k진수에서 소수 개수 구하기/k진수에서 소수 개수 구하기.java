import java.util.*;

class Solution {
    /**
    * 1. 문제 이해하기
    * - n(>= 0)을 k 진수로 바꾸었을 때, 변환된 수 안에 조건에 맞는 소수가 몇 개인가?
    * - 소수의 조건
    *   - 소수 양쪽에 0이 있는 경우
    *   - 소수 오른쪽에 0이 있는 경우
    *   - 소수 왼쪽에 0이 있는 경우
    *   - 소수 양쪽에 아무것도 없는 경우
    * 2. 제한 사항
    * - 1 <= n <= 1,000,000
    * - 3 <= k <= 10
    */
    
    public int solution(int n, int k) {
        
        // 3. 계획
        // - n을 k진수로 변환한 문자열을 만든다.
        String kStr = k != 10 ? parseWithRadix(n, k) : String.valueOf(n);
        System.out.println(kStr);
        kStr = kStr.contains("00") ? kStr.replaceAll("[0]{2,}", "0") : kStr;
        System.out.println(kStr);
        
        int answer = 0;
        System.out.println("isPrime");
        for(String s : kStr.split("0")) {
            System.out.print(s + " ");
            
            if(!s.equals("") && isPrime(Long.parseLong(s))) answer++;
        }
        
        return answer;
    }
    
    public String parseWithRadix(int n, int k) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % k);
            n /= k;
        }
        return sb.reverse().toString();
    }
    
    public boolean isPrime(long n) {
        if(n == 1) return false;
        
        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    
    
    
}