import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Integer[] arr3 = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr3, Collections.reverseOrder());
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < score.length; i++) {            
            
            if(min > arr3[i]) {
                min = arr3[i];
            }
            
            if((i + 1) % m  == 0) {
                answer += min * m;
            }
            
        }
        
        
        
        return answer;
    }
}