class Solution {
    /*
    * 1. 문제 이해하기
    * - n의 다음 큰 수(x)를 반환한다.
    * - 다음 큰 수(x)의 조건은 다음과 같다.
    *   1. x > n 인 자연수
    *   2. x의 이진수, n의 이진수의 1의 개수는 같다.
    *   3. x는 조건 1, 2를 만족하는 가장 작은 자연수이다.
    * 2. 제한 사항
    * - 1 <= n <= 1,000,000
    **/
    
    
    public int solution(int n) {
        int answer = 0;
        
        // 3. 계획하기 (시간 초과)
        // - n의 이진수를 구하고, 해당 1의 수(countOne)를 센다. Integer.toBinaryString()과 replaceAll 활용;
        // - n + 1부터 차례대로 이진수를 구해서 비교하여 가장 먼저 나온 값이 정답이다.
        
        /* (시간 초과)
        int x = 0;
        
        String str = Integer.toBinaryString(n);
        int countOne = str.length() - str.replaceAll("1", "").length();
        
        int nextCountOne = 0;
        while(countOne != nextCountOne) {
            str = Integer.toBinaryString(++n);
            nextCountOne = str.length() - str.replaceAll("1", "").length();
        }
        **/
        
        
        // 3 - 2. 계획하기 (시간 초과)
        // - toBinaryString()과 replaceAll을 사용하지 않고 나머지 연산을 활용하여  직접 1의 개수를 센다.
        
        /*
        String str = Integer.toBinaryString(n);
        int countOne = str.length() - str.replaceAll("1", "").length();
        
        int nextCountOne = 0;
        while(countOne != nextCountOne) {
            nextCountOne = 0;
            int temp = ++n;
            while(temp > 0) {
                if(temp % 2 == 1) nextCountOne++;
                temp /= 2;
            }
        }
        **/
        
        // 3 - 3. 계획하기
        // 해당 정수의 이진수의 1의 개수를 반환하는 Integer.bitCount(int n); 을 이용
    
        int countOne = Integer.bitCount(n);
        int nextCountOne = 0;
        while(countOne != nextCountOne) {
            nextCountOne = Integer.bitCount(++n);
        }
        
        
        
        return n;
    }
    
}