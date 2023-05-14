import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]", "0");
        
        return myStr.matches("[0]*$") ?  new String[] {"EMPTY"}
                : Arrays.stream(myStr.split("[0]+")).filter(str -> !str.equals("")).
                    toArray(String[]::new);
    }
}