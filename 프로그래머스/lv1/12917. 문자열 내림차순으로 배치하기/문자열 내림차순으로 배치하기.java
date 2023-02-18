import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split("")).sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.joining());
    }
}