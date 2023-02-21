import java.util.*;
import java.util.stream.*;

class Solution {
    
    public List solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) arr.add(numbers[i] + numbers[j]);
        }
        
        
        return arr.stream().distinct().sorted().collect(Collectors.toList());
    }
    

}