import java.util.*;

class Solution {
    /*
    * 1. 문제 이해하기
    * - s는 "0"과 "1"로 이루어진 문자열이며 다음과 같은 단계로 이진 변환를 진행한다.
    *   1. s의 모든 "0"을 제거
    *   2. s의 길이만큼 2진법으로 표현한 문자열로 치환
    * - s가 "1"이 될 때까지 위의 단계를 반복한다.
    *   - 출력 [이진 변환의 횟수, 제거된 모든 0의 개수]
    *
    * 1 - 1 제한 사항
    * - 1 <= s.length() <= 150,000
    * - 최소 "1" 한 개가 포함되어 있다.
    **/
    
    
    public int[] solution(String s) {
        int[] answer = {};
        
        // 2. 계획 (시간 복잡도 O(n^2))
        // 2 - 1 0의 개수를 세는 메서드 getZeroCount(String s)를 만든다.
        // 2 - 2 0을 제거하는 메서드 replaceZeroToBlank(String s)를 만든다.
        // 2 - 3 이후 길이를 이진법으로 표현하는 문자를 반환하는 twoRadixStringWithLength(String s)를 만든다.
        // 2 - 4 위 두 과정이 반복될 때마다 sum++, "0"의 개수를 zeroCount++
        
        int sum = 0;
        int zeroCount = 0;
        while(!s.equals("1")) {
            zeroCount += getZeroCount(s);
            s = replaceZeroToBlank(s);
            s = twoRadixStringWithLength(s);
            sum++;
        }
        
        
        return new int[] {sum, zeroCount};
    }
    
    public int getZeroCount(String s) {
        int zeroCount = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') zeroCount++;
        }
        return zeroCount;
    }
    
    public String replaceZeroToBlank(String s) {
        return s.replaceAll("0", "");
    }
    
    public String twoRadixStringWithLength(String s) {
        int num = s.length();
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            sb.append(num % 2);
            num /= 2;
        }
        return sb.reverse().toString();
    }

    
}