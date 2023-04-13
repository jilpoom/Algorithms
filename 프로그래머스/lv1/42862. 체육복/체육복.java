import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int idx = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int count = 0;
        for(int i = 0; i < lost.length; i++) {
            int l = lost[i];
            
            for(int j = 0; j < reserve.length; j++) {
                if(l == reserve[j]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    count++;
                    break;
                }
            }
        }
        
        
        for(int i = 0; i < lost.length; i++) {
            int lt = lost[i] - 1;
            int rt = lost[i] + 1;
            
            boolean flag = false;
            for(int j = idx; j < reserve.length; j++) {
                int r = reserve[j];
                if(r == lt || r == rt) {
                    idx = j + 1;
                    flag = true;
                    break;
                }
            }
            
            if(!flag) answer--; 
        }
        
        
        return answer + count;
    }
}