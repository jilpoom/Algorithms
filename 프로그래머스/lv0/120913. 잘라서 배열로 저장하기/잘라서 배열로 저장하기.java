import java.util.*;

class Solution {
    public ArrayList solution(String my_str, int n) {
        String[] arr = my_str.split("");
        ArrayList<String> answer = new ArrayList<>();
        
        int count = 0;
        String line = "";
        for(int i = 0; i < arr.length; i++) {
            line += arr[i];
            count++;
            
            if(count == n || i == arr.length - 1) {
                answer.add(line);
                count = 0;
                line = "";
            }
 
        }
        
        
        
        
        return answer;
    }
}