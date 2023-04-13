class Solution {
    int[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] y = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    
    public String solution(String X, String Y) {
        
        for(char c : X.toCharArray()) x[c - 48]++;
        for(char c : Y.toCharArray()) y[c - 48]++;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 9; i >= 0; i--) {
            for(int j = 0; j < Math.min(x[i], y[i]); j++) {
                sb.append(i);
            }
        }
        
        if(sb.toString().startsWith("0")) return "0";
        if(sb.toString().isEmpty()) return "-1";
        return sb.toString();
    }
}