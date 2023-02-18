import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] d, int budget) {
        List<Integer> list = Arrays.stream(d).boxed().collect(Collectors.toList());
        list.sort(Comparator.naturalOrder());
        System.out.println(list.toString());
        
        int sum = 0;
        
        int answer = 0;
        
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);          
            
            if(sum > budget) {
                answer = i;
                break;
            } else if (sum == budget) {
                answer = i + 1;
                break;
            }
        }
        
        if(sum < budget) {
            answer = list.size();
        }
        
        
        return answer;
        
    }
}