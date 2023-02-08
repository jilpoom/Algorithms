import java.util.*;

class Solution {
    public String solution(String s) {
        String[] lines = s.split("");
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < lines.length; i++){
            
            if(!map.containsKey(lines[i])) {
               map.put(lines[i], 1); 
            } else {
                map.put(lines[i], map.get(lines[i]) + 1);
            }
            
        }
        
        List<String> list = new ArrayList<>();
        List<String> keyList = new ArrayList<>(map.keySet());
        List<Integer> valueList = new ArrayList<>(map.values());
        
        for(int i = 0; i < keyList.size(); i++) {
            if(valueList.get(i) == 1) {
                list.add(keyList.get(i));
            }
        }
        
        
        Collections.sort(list);
        
        String answer = "";
        for(String i : list) {
            answer += i;
        }
        
        
        return answer;
    }
}