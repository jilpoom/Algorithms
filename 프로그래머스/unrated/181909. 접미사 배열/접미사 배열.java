import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        String ans = "";
        
        for(int i = my_string.length() - 1; i >= 0; i--) {
            ans = my_string.charAt(i) + ans;
            answer[i] = ans;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}