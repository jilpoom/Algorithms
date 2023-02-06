import java.util.*;

class Solution {
    public ArrayList solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int count = 0;
            
        for (int i = 0; i < my_string.length(); i++){
           char c = my_string.charAt(i);
            if(c >= '0' && c <= '9') 
                arr.add(Integer.parseInt(String.valueOf(c)));
        }
        
        Collections.sort(arr);
        
        
        return arr;
    }
}