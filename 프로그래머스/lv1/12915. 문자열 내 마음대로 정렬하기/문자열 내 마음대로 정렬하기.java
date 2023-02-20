import java.util.stream.*;
import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        return Arrays.stream(strings)
            .sorted(Comparator.naturalOrder())
            .sorted((s1, s2) -> s1.split("")[n].compareTo(s2.split("")[n]))
            .toArray(String[]::new);
    }
}