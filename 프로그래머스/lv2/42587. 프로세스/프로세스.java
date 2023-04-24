import java.util.*;

class Solution {
    /**
    * 1. 문제 이해하기
    * - 다음 규칙에 따라 프로세스가 관리될 경우, 특정 프로세스가 몇 번째로 실행되는가?
    * - {A, B, C, D} 순으로 {2, 1, 3, 2}의 우선 순위를 가질 때, {C, D, A, B} 순으로 실행된다.
    */
    
    
    public int solution(int[] priorities, int location) {
        int answer = 1;
        
        Queue<Node> queue = initQueue(priorities);
        
        int check[] = new int[priorities.length];
        
        // (2, 0), (1, 1), (3, 2), (2, 3) 
        
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            check[node.location] = 1;
            
            boolean flag = true;
            for(int i = 0; i < check.length; i++) {
                if(check[i] == 0 && priorities[i] > node.priority) {
                    queue.offer(node);
                    check[node.location] = 0;
                    flag = false;
                    break;
                }
            }
            
            if(flag) {
                if(node.location == location) return answer;
                else answer++;
            }
            
        }
        
        return answer;
    }
    
    
    public Queue<Node> initQueue(int[] priorities) {
        Queue<Node> queue = new LinkedList();
        
        for(int i = 0; i < priorities.length; i++) {
            queue.offer(new Node(priorities[i], i));
        }
        return queue;
    }

}


class Node {
    int priority;
    int location;
    
    public Node(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }
}