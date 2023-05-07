import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
            .filter(str -> !str.contains("ad"))
            .collect(Collectors.joining("-"))
            .split("-");
    }
}