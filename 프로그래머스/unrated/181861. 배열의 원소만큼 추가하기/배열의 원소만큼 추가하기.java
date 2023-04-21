import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(Arrays.stream(arr)
            .mapToObj(i -> String.valueOf(i + " ").repeat(i))
            .collect(Collectors.joining(""))
            .split(" "))
            .mapToInt(i -> Integer.parseInt(i))
            .toArray();
            
    }
}