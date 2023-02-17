import java.util.*;

class Solution {
    public ArrayList solution(int x, int n) {
        ArrayList<Long> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            list.add((long) x * i);
        }
        
        return list;
    }
}