import java.util.PriorityQueue;

class Solution {
    /**
    * 1. 문제 이해하기
    * - 모든 음식의 스코빌 지수를 K 이상으로 만든다.
    * - 스코빌 지수가 가장 낮은 두 개의 음식을 섞어 새로운 음식을 만든다.
    * - (가장 맵지 않은 것 + 두 번째로 맵지 않은 것 * 2)
    * - 모든 음식을 K 이상으로 만들기 위한 최소 횟수 반환
    * 2. 제한 사항
    * - 2 <= scoville.length <= 1,000,000
    * - 0 <= K <= 1,000,000,000
    * - 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우 -1 반환
    */
    
    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> heap = new PriorityQueue();
        
        // 3. 계획 : 최소 힙을 활용한다.
        // - 음식 두 개를 섞고 하나를 다시 heap에 offer한다.
        // - 해당 힙의 최소값(heap.peek())이 K보다 작다면 다시 반복하고, 그렇지 않다면 반복을 끝낸다.
        // - 단, 한 번도 반복문을 돌지 않았다면, 힙의 모든 요소가 K보다 큰 것이므로, 0을 반환한다.
        // - 단, heap.size()가 1이 되었는데도, 여전히 K보다 작다면 조건을 만족할 수 없는 경우 이므로 -1을 반환한다.
        
        for (int aScoville : scoville) {
            heap.offer((long) aScoville);
        }
        
        int count = 0;
        
        while(heap.peek() < K) {
            if(heap.size() == 1 && heap.peek() < K) return -1;
            count++;
            long a = heap.poll();
            long b = heap.poll();
            long newFood = a + (b * 2);
            heap.offer(newFood);
        }
        
        
        return count;
    }
}