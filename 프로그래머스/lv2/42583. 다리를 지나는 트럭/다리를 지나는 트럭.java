import java.util.*;

class Solution {

    Queue<Integer> queue = new LinkedList<>();
    int curWeight = 0;        
    int answer = 0;
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {    
        
        // truck_weights 배열의 마지막까지 다리로 이동.
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
        
        // 지나갈 수 없는 자리에는 0을 채웠으므로, 완전히 queue(다리)를 비우기 위해서는 
        // 이미 지난 시간에, queue가 빌 때까지의 시간(bridge_length)를 더해준다.
        return answer + bridge_length; 
    }
}