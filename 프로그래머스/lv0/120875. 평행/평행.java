import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, (o1, o2) -> o1[0] - o2[0]);
        
        double line1 = (dots[1][1] - dots[0][1]) / (double) (dots[1][0] - dots[0][0]);       
        double line2 = (dots[3][1] - dots[2][1]) / (double) (dots[3][0] - dots[2][0]);  
        
        return line1 == line2 ? 1 : 0;
    }
}