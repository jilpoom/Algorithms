import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int minLeft = lines[0][0];
        int maxRight = lines[0][1];
        
        for(int i = 0; i < lines.length; i++) {
            maxRight = Math.max(lines[i][1], maxRight);
            minLeft = Math.min(lines[i][0], minLeft);
        }
        
        int[] countLines = new int[maxRight - minLeft + 1];
        
        for(int i = 0; i < lines.length; i++) {
            for(int j = lines[i][0]; j < lines[i][1]; j++) {
                countLines[j - minLeft]++;
            }
        }
        
        int answer = 0;
        for(int i = 0; i < countLines.length; i++) {
            if(countLines[i] >= 2) {
                answer++;    
            }
        }
        
        
        return answer;
    }
}