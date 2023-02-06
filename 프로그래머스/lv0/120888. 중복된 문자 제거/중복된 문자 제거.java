import java.util.*;

class Solution {
    public String solution(String my_string) {
        HashMap<Character, Integer> map = new HashMap<>();
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if(map.get(c) == null) {
                map.put(c, 1);
                answer += String.valueOf(c);
            } else {
                continue;
            }

        }

        
        return answer;
    }
}