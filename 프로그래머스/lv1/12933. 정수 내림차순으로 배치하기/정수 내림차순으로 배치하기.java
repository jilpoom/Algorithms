import java.util.stream.*;
import java.util.*;

class Solution {
    public long solution(long n) {
        
        List<Integer> Arr = Arrays.asList(String.valueOf(n).split("")).stream().mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        Collections.sort(Arr, Comparator.reverseOrder());

        long num = Long.parseLong(Arr.stream().map(s -> String.valueOf(s)).collect(Collectors.joining()));

        
        return num;
    }
}