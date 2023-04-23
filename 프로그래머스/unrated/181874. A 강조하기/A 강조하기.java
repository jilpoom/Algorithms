import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String myString) {
        return Arrays.stream(myString.split(""))
            .map(s -> s.equals("a") || s.equals("A") ? "A" : s.toLowerCase())
            .collect(Collectors.joining(""));
    }
}