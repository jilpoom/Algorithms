import java.util.*;

public class Solution {
    public ArrayList solution(int[] arr) {
        int prev = arr[0];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(prev);
        
        for(int i = 1; i < arr.length; i++) {
            if(prev == arr[i]) {
                continue;
            } else{
                list.add(arr[i]);
                prev = arr[i];
            }
        }
        
        return list;
    }
}