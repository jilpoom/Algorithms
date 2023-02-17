import java.util.*;

class Solution {
    boolean solution(String s) {
        return Arrays.stream(s.split("")).filter(s1 -> !s1.equals("P") && !s1.equals("p")).count() == Arrays.stream(s.split("")).filter(s1 -> !s1.equals("y") && !s1.equals("Y")).count();
    }
}