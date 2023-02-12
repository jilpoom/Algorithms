class Solution {
    public int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];
        
        int width = 0;
        int height = 0;        
        
            for(int i = 1; i < 4; i++) {
                if(dots[i][0] == x) {
                    height = Math.abs(y - dots[i][1]);
                } 
                if(dots[i][1] == y) {
                    width = Math.abs(x - dots[i][0]);
                }
            }
  
        
        
        return width * height;
    }
}