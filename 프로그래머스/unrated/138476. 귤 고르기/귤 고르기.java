import java.util.*;

class Solution {
    // 1. 문제 이해하기
    // - k 개의 귤을 골라 상자에 담아 판매한다.
    // - 단, 귤을 크기별로 분류햇을 때 서로 다른 종류의 수를 최소화 한다.
    // - 최소 개수를 반환한다.
    // 2. 제한사항
    // - 1 <= k <= tangerine.length <= 100,000
    // - 1 <= tangerine[i] <= 10,000,000
    
    public int solution(int k, int[] tangerine) {
        
        // 3. 계획
        // 그리디 방식으로 해결한다.
        // HashMap을 사용하여 무게별 개수를 찾는다.
        // tangerine 무게와 개수를 필드 값으로 하는 클래스를 선언한다.(X) (무게는 해당 문제에 중요하지 않다.)
        // tangerine의 개수별로 내림차순(개수가 많은 순으로) 정렬한다.
        // 내림차순으로 정렬한 리스트를 순회하며, (k - 리스트 원소)을 수행한다. 연산이 진행될 때마다 answer++
        // k가 0을 만족하면, return answer
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i : tangerine) map.put(i, map.getOrDefault(i, 0) + 1);
        for(int weight : map.keySet()) list.add(map.get(weight));
        
        Collections.sort(list, Collections.reverseOrder());
        
        int answer = 1; // 한 가지 무게로 상자를 만들 수 있는 경우의 수
        
        for(int i : list) {
            if(k - i <= 0) return answer; 
            k -= i;
            answer++;
        }
        
        
        return answer;
    }
}
/**
class TangerineCount{
    int w;
    int count;
    
    public tangerineCount(int w, int count) {
        this.w = w;
        this.count = count;
    }

}
*/
