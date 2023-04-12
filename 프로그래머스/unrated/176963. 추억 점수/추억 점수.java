import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Map<String, Integer> map = missScore(name, yearning);
        
        for(String[] humans : photo) {
            int sum = 0;
            for(String human : humans) {
                sum += map.getOrDefault(human, 0);
            }            
            list.add(sum);
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public Map<String, Integer> missScore(String[] name, int[] yearning) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        return map;
    }
}