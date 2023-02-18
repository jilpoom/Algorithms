import java.util.*;
import java.util.stream.*;

class Solution {
    public List solution(int[] arr) {
        
        int min = Arrays.stream(arr)
            .min()
            .getAsInt();
        
        List<Integer> list = Arrays.stream(arr)
            .boxed()
            .filter(i -> i != min)
            .collect(Collectors.toList());
        
        if(list.isEmpty()) {
            list.add(-1);
        }
        
        
        return list;
    }
}