import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> deleteList = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
        
        for(int i : deleteList) {
            if(arrList.contains(i)) arrList.remove(arrList.indexOf(i));
        }
        
        return arrList.stream().mapToInt(i -> i).toArray();
    }
}