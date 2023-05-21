import java.util.*;
class Solution {
    Map<String, Integer> map = new HashMap<>();
    
    {
        map.put("americano", 4500);
        map.put("cafelatte", 5000);
        map.put("anything", 4500);
    }    
    
    public int solution(String[] order) {
        int result = 0;
        for(String s : order) {
            for(String key : map.keySet()) {
                if(s.contains(key)) result += map.get(key);
            }
        }
        
        return result;
    }
}