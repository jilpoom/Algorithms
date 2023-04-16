import java.util.*;

class Solution
{
    /**
    * 1. 문제 이해하기
    * - S는 소문자 문자열이다.
    * - 같은 알파벳이 2개 붙어있는 짝을 찾고, 그 둘을 제거한 후, 나머지를 이어 붙인다.
    * ex. "baabaa" -> "bb" -> ""
    * - 이 과정을 반복해서 완전히 문자가 제거 된다면 1, 아니면 0을 반환한다.
    * 
    * 2. 제한 사항
    * - 1 <= S.length() <= 1,000,000
    * - 문자열은 모두 소문자이다.
    */
    
    public int solution(String s)
    {
        int answer = -1;
        
        // 예외 1.
        // 문자열이 홀수라면 완전히 문자열을 제거할 수 없으므로 false
        if(s.length() % 2 == 1) return 0;
        
        
        // 3. 계획 (시간 초과)
        // - S.replaceAll() 메서드를 사용하여, 중복되는 값을 제거하며 반복한다.
        // - replaceAll()로 변환되지 않은 경우, 반복을 빠져나온다.
        // 3 - 1 결과
        // - replaceAll(), replaceFirst() 모두 시간 초과
        
        /**
        String tmp = "";
        while(!s.equals(tmp)) {
            tmp = s;
            for(int i = 0; i < s.length() - 1; i++) {
                if(s.charAt(i) == s.charAt(i + 1)) {
                    s = s.replaceAll("[" + s.charAt(i) + "][" + s.charAt(i) + "]", "");
                    break;
                }   
            }
        }
        */
        
        // 3 - 2. 계획 (실패)
        // - 문자의 개수를 세서 하나라도 홀수라면, false
        // - 모두 짝수라면 1
        // - 단, "bbabab", "aababa" 와 같은 문자가 두 번 이상 반복되는 경우 return 0; (예외 처리 힘듬.)
        
        /**
        int[] alphabet = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] % 2 == 1) return 0;
        }
        */
        
        // 3 - 3 계획
        // - Stack을 사용하여, 한글자 씩 넣으면서, 앞 문자와 같다면 pop() 한다.
        // - Stack이 남아있다면 0, 아니라면 1을 반환한다.
        
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }        

        return stack.size() == 0 ? 1 : 0;
    }
}