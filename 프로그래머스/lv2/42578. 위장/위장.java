import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // value - key;
        
        Map<String, Integer> map = clothesToMap(clothes);
        
        System.out.println(map);
        
        int answer = 1;
        
        for(String s : map.keySet()) {
            answer *= map.get(s) + 1;
        }
        
        answer -= 1;
        return answer;
    }
    
    public HashMap<String, Integer> clothesToMap(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String[] s : clothes) {
            map.put(s[1], map.getOrDefault(s[1], 0) + 1);
        }
        
        return map;
    }
}