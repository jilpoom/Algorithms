class Solution {
    private static boolean[][] visited;
    private static int boardLength;
    private static int[][] arr;
    
    public int solution(int[][] board) {
        arr = board;
        boardLength = board.length;
        visited = new boolean[board.length][board.length];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(!visited[i][j] && arr[i][j] == 1) {
                    dfs(i, j);
                }
                
            }
        }
        
        int answer = 0;
        
        for(boolean[] bl: visited){
            for(boolean b : bl) {
                if(b == false) {
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
    
    public void dfs(int x, int y) {
        
        if(x < 0 || y < 0 || x >= boardLength || y >= boardLength) {
            return;
        }
        
        
        if(!visited[x][y]) {
            
            visited[x][y] = true;
            
            if(arr[x][y] == 1){
            dfs(x + 1, y);
            dfs(x, y + 1);
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y + 1);
            dfs(x - 1, y - 1);
            dfs(x - 1, y + 1);
            dfs(x + 1, y - 1);
            }
        }
        
        
        
        
        
    }
}