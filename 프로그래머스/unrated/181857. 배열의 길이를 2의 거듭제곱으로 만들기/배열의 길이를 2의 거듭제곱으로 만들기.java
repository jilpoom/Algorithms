import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        for(int i = 0; i < matchPowerTwo(size); i++) {
            list.add(0);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    public int matchPowerTwo(int size) {
        int match = 1;
        
        while(size > match) {
            match *= 2;
        }
        
        return match - size;
    }
    
}