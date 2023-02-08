import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();        
        
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                arr.add(i);
                if(i != n / i) arr.add(n / i);         
            }
        }
        
        Collections.sort(arr);
        
        
        return arr;
    }
}