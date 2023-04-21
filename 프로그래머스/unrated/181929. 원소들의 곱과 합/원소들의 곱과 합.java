import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        return Arrays.stream(num_list).reduce((a, b) -> a * b).getAsInt() <
            Math.pow(Arrays.stream(num_list).sum(), 2) ? 1 : 0;
    }
}