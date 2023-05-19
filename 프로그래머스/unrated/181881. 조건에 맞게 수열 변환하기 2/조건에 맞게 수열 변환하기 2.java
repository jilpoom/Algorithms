import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int[] arr2 = new int[arr.length];
        
        int count = 0;
        while(!Arrays.equals(arr, arr2)) {
            arr2 = arr.clone();
            count++;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) arr[i] = arr[i] / 2;
                else if(arr[i] < 50 && arr[i] % 2 == 1) arr[i] = 2 * arr[i] + 1;
            }
        }
        
        
        return count - 1;
    }
    
    
    
}