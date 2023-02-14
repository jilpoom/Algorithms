class Solution {
    public int solution(int n) {
        int[] DP = new int[101];
        
        int count = 1;
        
        for(int i = 1; i < DP.length; i++) {
            
            while(true) {
            
                if(count % 3 == 0 || String.valueOf(count).contains("3")) {
                    count++;
                    continue;
                } 
                
                DP[i] = count;
                count++;
                break; 
            }
            
            if(DP[n] != 0) {
                break;
            }
        
        }
        
        
        
        return DP[n];
    }
}