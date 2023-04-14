import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        
        for(int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            
            min = Math.min(num, min);
            max = Math.max(num, max);
            
        }
        
        return min + " " + max;
    }
}