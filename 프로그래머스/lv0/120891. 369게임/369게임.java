class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String line = String.valueOf(order);
        
        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            
            if(c == '3' || c == '6' || c == '9') {
                answer++;
            }
            
        }
        
        
        return answer;
    }
}