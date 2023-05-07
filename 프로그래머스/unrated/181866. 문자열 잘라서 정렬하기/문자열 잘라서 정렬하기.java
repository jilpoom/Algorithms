import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] ans = Arrays.stream(myString.split("x"))
            .filter(str -> !str.equals(""))
            .toArray(String[]::new);
            
        Arrays.sort(ans);
        for(String s : ans) {
            System.out.print(s + " ");
        }
        return ans;
    }
}