import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        if(list.indexOf(2) == -1) return new int[] {-1};
        
        int start = list.indexOf(2);
        int end = list.lastIndexOf(2);        
        
        
        return IntStream.rangeClosed(start, end)
            .map(i -> arr[i])
            .toArray();
    }
}