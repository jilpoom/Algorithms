import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        return IntStream.concat(
            Arrays.stream(num_list),
            IntStream.of(num_list[num_list.length - 1] > num_list[num_list.length - 2] ? 
                     num_list[num_list.length - 1] - num_list[num_list.length - 2] :
                     num_list[num_list.length - 1] * 2)
        ).toArray();
    }
}