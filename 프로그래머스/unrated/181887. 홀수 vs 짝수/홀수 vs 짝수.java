import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        int sum1 = IntStream.range(0, num_list.length)
            .filter(i -> i % 2 == 0)
            .map(i -> num_list[i])
            .sum();
        int sum2 = IntStream.range(0, num_list.length)
            .filter(i -> i % 2 == 1)
            .map(i -> num_list[i])
            .sum();
        
        
        return sum1 == sum2 ? sum1 : Math.max(sum1, sum2);
    }
}