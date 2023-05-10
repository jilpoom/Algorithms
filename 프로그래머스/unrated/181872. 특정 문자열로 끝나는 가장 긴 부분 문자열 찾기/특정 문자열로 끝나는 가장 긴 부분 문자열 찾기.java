import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String myString, String pat) {
        
        String answer = "";
        
        for(int i = 0 ; i <= myString.lastIndexOf(pat) + pat.length() - 1; i++) {
            answer += myString.charAt(i);
        }
        
        return answer;
    }
}