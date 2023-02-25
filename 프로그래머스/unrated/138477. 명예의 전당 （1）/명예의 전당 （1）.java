import java.util.*;

class Solution {
    
    static ArrayList<Integer> list;
    
    public int[] solution(int k, int[] score) {
        list = new ArrayList<>();
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
            if(list.size() < k) {
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
                continue;
            }
            
            if(list.size() == k) {
                int min = list.get(0);
                
                if(min < score[i]) {
                    list.remove(0);
                    list.add(score[i]);
                    Collections.sort(list);
                }
                
            }
            
            answer[i] = list.get(0);
            
        }
        
   
        return answer;
    }
}