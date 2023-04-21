import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        
        return my_string.trim().replaceAll("\\s{2,}", " ").split(" ");
    }
}