import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] nums) {
        int distCount = (int) Arrays.stream(nums)
            .boxed()
            .distinct()
            .count();
        
        return distCount <= nums.length / 2 ? distCount : nums.length / 2;
    }
}