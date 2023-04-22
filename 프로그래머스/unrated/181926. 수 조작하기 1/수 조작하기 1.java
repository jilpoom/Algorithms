import java.util.*;

class Solution {
    
    static Map<String, Integer> map = new HashMap<>();
    
    static {
        map.put("w", 1);
        map.put("s", -1);
        map.put("d", 10);
        map.put("a", -10);
    }
    
    public int solution(int n, String control) {
        
        for(String s : control.split("")) n += map.get(s);
        
        return n;
    }
    
    
    
}