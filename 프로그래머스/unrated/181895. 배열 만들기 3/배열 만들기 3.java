import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        return IntStream.concat(
        IntStream.rangeClosed(intervals[0][0], intervals[0][1])
            .map(i -> arr[i]),
        IntStream.rangeClosed(intervals[1][0], intervals[1][1])
            .map(i -> arr[i])
        ).toArray();
    }
}