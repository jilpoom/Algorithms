import java.util.*;

class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n));
        String[] reverseArr = sb.reverse().toString().split("");
        
        return Arrays.stream(reverseArr)
            .mapToInt(Integer::parseInt)
            .toArray();
    }
}