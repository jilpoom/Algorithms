import java.util.*;

class Solution {
    private static boolean[] visited;
    private static int[] numbers;
    private static int count;
    private static int sum;
    
    
    public int solution(int[] number) {
        numbers = number;
        visited = new boolean[number.length];
        DFS(0, 0);
        
        return count;
    }
    
    public void DFS(int n, int depth) {
        if(depth == 3) {
            for(int i = 0; i < visited.length; i++) {
                if(visited[i]) sum += numbers[i];
            }
            
            if(sum == 0) {
                count++;
            }
            sum = 0;
            return;
        }
        
        for(int i = n; i < visited.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                DFS(i + 1, depth + 1);
                visited[i] = false;
            }  
        }
    }
    
}