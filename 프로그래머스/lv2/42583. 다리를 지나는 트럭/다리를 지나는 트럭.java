import java.util.*;

class Solution {

    Queue<Integer> queue = new LinkedList<>();
    int curWeight = 0;        
    int answer = 0;
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {    
        
        // 1. 다리로 이동
        for(int i = 0; i < truck_weights.length; i++) {
            curWeight += truck_weights[i];
            
            if(curWeight > weight) {
                curWeight -= truck_weights[i];
                i--;
                queue.offer(0);

            } else {
                queue.offer(truck_weights[i]);
            }
            
            if(queue.size() == bridge_length) {
                curWeight -= queue.poll();
            } 

            answer++;
            
        }
        

        
        return answer + bridge_length; 
    }
}