import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        int answer = 0;
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++) {
            if(min > Math.abs(n - array[i])) {
                min = Math.abs(n - array[i]);
                answer = array[i];
            } else if(min == Math.abs(n - array[i])) {
                if(answer > array[i]) {
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}