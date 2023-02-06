import java.util.*;

class Solution {
    public ArrayList solution(String[] strlist) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < strlist.length; i++) {
            list.add(strlist[i].length());
        }
        
        return list;
    }
}