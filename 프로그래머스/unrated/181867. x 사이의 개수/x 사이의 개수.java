import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String myString) {
        System.out.println(myString);
        List<String> str = Arrays.stream(myString.split("x")).collect(Collectors.toList());
        if(myString.charAt(myString.length() - 1) == 'x') str.add("");
        System.out.println(str);
        return str.stream().mapToInt(s -> s.length()).toArray();
    }
}