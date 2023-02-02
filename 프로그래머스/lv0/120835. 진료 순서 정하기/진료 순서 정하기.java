import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] A = new int[101];
        
        for(int i : emergency){
            A[i] = i;
        }
        
        int count = 1;
        
        for(int i = A.length - 1; i > 0; i--){
            if(A[i] != 0){
                
                for(int j = 0; j < emergency.length; j++){
                    if(emergency[j] == A[i]){
                        answer[j] = count++;
                    }
                    
                }
            }
        }

        return answer;
    }
}