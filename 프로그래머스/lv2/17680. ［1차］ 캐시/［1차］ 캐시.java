import java.util.*;

class Solution {
    /**
    * 1. 문제 이해하기
    * - LRU(Least Recently Used)의 정의
    *   - 가장 나중에 사용된 것이 먼저 나간다.
    * - 제한 사항
    * - 0 <= cacheSize <= 30
    * - 1 <= cities.length <= 100,000
    * - 영문자는 대소문자를 구분하지 않는다. (String.equalsIgnoreCase())
    */
    
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        // 3. 계획
        // - 캐시를 결정할 ArrayList를 선언한다.
        // - cities를 순회하며 queue에 입력한다.
        // - Cache Hit
        //    - Hit된 캐시를 최상단으로 바꾸고, 나머지를 뒤로 미룬다.
        // - Cache Miss
        //    - 사이즈를 초과한다면, 가장 오래된 캐시를 제거하고, 캐시에 입력한다.
        
        ArrayList<String> list = new ArrayList<>();
        
        for(String s : cities) {
            s = s.toLowerCase();
            if(!list.isEmpty() && list.contains(s)) { // Cache Hit
                answer++;
                list.remove(s);
            } else answer += 5;
            
            list.add(s);
            if(list.size() > cacheSize) list.remove(0);
        }
        
        
        
        return answer;
    }
    
    
}