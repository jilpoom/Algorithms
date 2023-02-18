import java.util.*;
import java.util.stream.*;

class Solution {
    
    public String solution(String s, int n) {
        
        return Arrays.stream(s.split(""))
            .map(s1 -> {
                if(s1.matches("[A-Z]")) {
                    int num = s1.charAt(0) - 'A';
                    int num2 = num + n >= 26 ? num + n - 26 : num + n;
                    return String.valueOf((char) (num2 + 'A'));
                } else if (s1.matches("[a-z]")) {
                    int num = s1.charAt(0) - 'a';
                    int num2 = num + n >= 26 ? num + n - 26 : num + n;
                    return String.valueOf((char) (num2 + 'a'));
                } else {
                    return s1;
                }
                
            })
            .collect(Collectors.joining());
                
                 
                 
    }


}