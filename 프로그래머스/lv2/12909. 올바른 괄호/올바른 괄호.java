import java.util.*;

class Solution {
    /*
    * 1. 문제 해석
    * 올바른 괄호 : ["(()())", "()()"]
    * 올바르지 않은 괄호 : ["()(", ")()", "))("] 
    *
    * 1 - 1. 올바른 괄호의 조건 
    * - 올바른 괄호는 반드시 '(' 가 ')' 와 짝지어진다. - '(' 가 존재하면, 반드시 ')'가 존재한다. (홀수 길이 제외)
    * - 처음 시작이 '(' 로 시작한다. (앞이 ')'인 경우 제외)
    *
    * 1 - 2. 제한 사항
    * - 1 <= s.length() <= 100,000
    * - '(', ')' 외에는 포함하지 않는다.
    **/
    
    boolean solution(String s) {
        boolean answer = true;
        
        // 2. 계획
        
        // 제한 사항 적용
        if(s.length() % 2 == 1) return false;
        if(s.charAt(0) == ')') return false;
        
        // 2 - 1 Stack 선언 - 짝지어야 하므로, 반드시 '('와 ')'가 매칭되면 pop()을 수행한다.
        Stack<Character> stack = new Stack<>();
        
        char[] charArr = s.toCharArray();
        
        for(char c : charArr) {
            if(c == '(') stack.push(c); // '(' 인 경우 push
            else {
                if(stack.isEmpty()) return false; // 짝지을 대상이 없는 경우
                if(stack.peek() == ')') // '('과 짝지어 pop()을 하려는데 pop() 할 대상이 ')' 인 경우
                    return false;
                else stack.pop();
            }
        }
        
        // 배열을 마쳤는데 stack이 완전히 비어있지 않다면, false
        if(stack.size() > 1) return false;
        return answer;
    }
}