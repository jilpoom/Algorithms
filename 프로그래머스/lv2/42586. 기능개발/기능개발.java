import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            queue.offer(progresses[i]);
        }
        
        int idx = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(!queue.isEmpty()) {
            
            for(int i = idx; i < speeds.length; i++) {
                int sum = queue.poll() + speeds[i];
                System.out.println("Queue");
                System.out.println(sum + " ");
                queue.offer(sum);
            }
            
            
            int count = 0;
            while(!queue.isEmpty() && queue.peek() >= 100) {
                queue.poll();
                count++;
                idx++;
            } 
              
            if(count != 0) list.add(count);
        }
        
        System.out.println(list);
        
        
        return list;
    }
}