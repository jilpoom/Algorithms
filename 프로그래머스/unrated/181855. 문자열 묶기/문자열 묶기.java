import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < strArr.length; i++) {
            map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0) + 1);
        }
        
        int max = Integer.MIN_VALUE;
        for(int i : map.keySet()) {
            if(max < map.get(i)) max = map.get(i);
        }
        return max;
    }
}