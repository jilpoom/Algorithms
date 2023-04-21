import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String myString, String pat) {
        return myString.contains(Arrays.stream(pat.split(""))
            .map(s -> s.equals("A") ? "B" : "A").collect(Collectors.joining(""))) ? 1 : 0;
    }
}