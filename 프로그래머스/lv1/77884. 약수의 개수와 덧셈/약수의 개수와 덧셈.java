import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int left, int right) {
        
        return IntStream.range(left, right + 1)
            .map(i -> isAbs(i) ? -(i) : i)
            .sum();
    }
    

    public boolean isAbs(int n) {
        return  (int) Math.sqrt(n) * (int) Math.sqrt(n) == n;
    }
}