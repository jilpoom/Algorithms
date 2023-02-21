import java.util.*;

class Solution {
    Stack<String> stack = new Stack<>();
    
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 1; i < food.length; i++) {
            String s = String.valueOf(i).repeat(food[i] / 2); 
            stack.add(s);
            answer += s;
        }
        
        answer += "0";
        
        while(!stack.isEmpty()) {
            answer += stack.pop();
        }
        
        return answer;
    }
}