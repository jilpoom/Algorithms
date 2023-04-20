import java.util.*;

class Solution {
    /**
    * 1. 문제 이해하기
    * - 소, 중, 대괄호로 이루어진 문자열 s를 왼쪽으로 x 번만큼 회전시켰을 때, 올바른 괄호인 경우의 수를 반환하시오
    * 2. 제한 사항
    * - 0 <= x < s.length() (길이가 4라면, 총 4번 회전시킬 수 있다.)
    * - 1 <= s.length() <= 1,000
    */
    static Map<Character, Character> map = new HashMap<>();
    
    
    public int solution(String s) {
        // 3. 계획
        // - s를 회전시키며, 확인한다.
        // - 좌괄호일 때 push, Stack이 비어있지 않으면서, 우괄호일 떄 pop()을 진행한다. (짝짓기)
        // - 올바른 괄호라면 count++
        // 3 - 1. 예외 상황
        // - s.length() % 2 == 1 인 경우, 올바른 괄호 문자열은 나올 수 없다.
        if(s.length() % 2 == 1) return 0;
        
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            if(isRightParentheses(s)) answer++;    
            s = s.substring(1, s.length()) + s.charAt(0);
        }

        return answer;
    }
    
    
    public boolean isRightParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && map.containsValue(c)) {                
                char left = stack.peek();
                if(map.get(left) == c) stack.pop();
            } else if(map.containsKey(c)) {
                stack.push(c);    
            }
            
        }
        
        
        return stack.size() == 0 ? true : false;
    }
    
}