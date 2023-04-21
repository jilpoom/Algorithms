import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        if(num_list.length <= 10) {
            int multi = 1;
            for(int i : num_list) {
                multi *= i;
            }
            return multi;
        }
        
        return Arrays.stream(num_list).sum();
    }
}