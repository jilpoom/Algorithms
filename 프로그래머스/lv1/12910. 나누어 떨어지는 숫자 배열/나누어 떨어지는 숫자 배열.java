import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] arr1 = Arrays.stream(arr)
            .filter(i -> i % divisor == 0)
            .sorted()
            .toArray();
        return arr1.length == 0 ? new int[] { -1 } : arr1;
    }
}