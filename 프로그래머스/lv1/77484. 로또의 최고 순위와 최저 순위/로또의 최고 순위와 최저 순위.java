import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int equals = countEquals(lottos, win_nums);
        
        int zeroCount = 0;
        
        for(int n : lottos) {
            if(n == 0) zeroCount++;
        }
        
        int[] answer = new int[2];
        answer[0] = 6 - equals + 1 - zeroCount > 6 ? 6 : 6 - equals + 1 - zeroCount;
        answer[1] = 6 - equals + 1 > 6 ? 6 : 6 - equals + 1;
        
        return answer;
    }
    
    public int countEquals(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        int count = 0;
        
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) continue;
            
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    count++;
                    break;
                }
            }
            
        }
        
        return count;
    }
}