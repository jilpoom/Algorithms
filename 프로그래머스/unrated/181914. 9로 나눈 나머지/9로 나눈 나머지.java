import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String number) {
        
        return IntStream.range(0, number.length())
            .map(i -> number.charAt(i) - '0')
            .sum() % 9;
    }
}