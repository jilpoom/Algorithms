import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = participantToMap(participant);
        for(String c : completion) {
            if(map.get(c) != 0) {
                map.put(c, map.get(c) - 1);
            } 
        }
        
        for(String p : participant) {
            if(map.get(p) == 1) answer = p;
        }
        
        return answer;
    }
    
    public Map<String, Integer> participantToMap(String[] participant) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        return map;
    }
}