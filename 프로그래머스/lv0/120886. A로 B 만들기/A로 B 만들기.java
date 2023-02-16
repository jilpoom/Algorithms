import java.util.*;

class Solution {
    
    public int solution(String before, String after) {
        String[] beforeArr = before.split("");
        
        for(int i = 0; i < beforeArr.length; i++) {
            after = after.replaceFirst(beforeArr[i], "");
        }           
                
        return after.equals("") ? 1 : 0;
    }
    

}