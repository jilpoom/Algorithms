import java.util.*;

class Solution {
    public ArrayList solution(int n) {       
        ArrayList<Integer> arr = new ArrayList<>();
        
        int count = 2;
        
        while(n > 1) {
            
            if(n % count == 0) {
                n /= count;
                if(arr.lastIndexOf(count) == -1) {
                    arr.add(count);
                }
                
            } else {
                count++;
            }
            
        }
        
        return arr;
    }
}