import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {

        Deque<Integer> deque = new LinkedList<>();

        for(int i = 0; i < numbers.length; i++){
            deque.addLast(numbers[i]);
        }

        if(direction.equals("right")) {
            deque.addFirst(deque.pollLast());
        } else if (direction.equals("left")){   
            deque.addLast(deque.pollFirst());
        }
        
        return  deque.stream().mapToInt(Integer::intValue).toArray();
    }
}