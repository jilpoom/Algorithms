import java.util.stream.IntStream;
import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
    
        return IntStream.rangeClosed(end, start)
            .boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(i -> i)
            .toArray();
    }
}