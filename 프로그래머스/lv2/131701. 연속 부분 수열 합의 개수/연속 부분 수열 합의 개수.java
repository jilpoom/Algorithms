import java.util.*;

class Solution {
    /**
    * 1. 문제 이해하기
    * - 원형 수열의 연속 부분 수열 합의 개수를 구하라.
    * 2. 제한사항
    * - 3 <= elements.length <= 1,000
    * - 1 <= elements[i] <= 1,000
    */
    
    
    public int solution(int[] elements) {
        
        // 3. 계획\
        // - elements의 배열을 복사하여, 두 개를 붙인다.
        int[] newElements = new int[elements.length * 2];
        
        for(int i = 0; i < elements.length; i++) {
            newElements[i] = newElements[i + elements.length] = elements[i];
        }
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 1; i <= elements.length; i++) {
            for(int j = 0; j < elements.length; j++) {
                set.add(Arrays.stream(newElements, j, j+i).sum());
            }
        }
        
        return set.size();
        
        
        
        
        
    }
}