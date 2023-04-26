import java.util.*;

class Solution {
    /**
    * 1. 문제 이해하기
    * - 현재 피로도 k(>= 0)와 던전 탐험 최소 피로도, 소모 피로도 dungeons가 주어졌을 때,
    *   탐험 가능한 최대 던전 수를 반환
    * 2. 제한 사항
    * - 1 <= k <= 5,000
    * - 1 <= dungeons.length <= 8
    * - dungeons[i][0] >= dungeons[i][1];
    * - 1 <= dungeons[i][0], dungeons[i][1] <= 1,000
    * - 서로 다른 던전의 요소는 같을 수 있다.
    */
    boolean[] visited;
    int answer;
    
    
    public int solution(int k, int[][] dungeons) {
        // 3. 계획
        // - DFS 방식으로 접근한다.
        visited = new boolean[dungeons.length];
        
        DFS(0, k, dungeons);
        
                
        return answer;
    }
    
    public void DFS(int count, int k, int[][] dungeons) {
        
        for(int i = 0; i < dungeons.length; i++) {
            if(visited[i] == false && dungeons[i][0] <= k) {
                visited[i] = true;
                DFS(count + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, count);
    }
    

}

