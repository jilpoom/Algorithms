class Solution {
    public int solution(String s) {
        String[] str = s.split("");
        int answer = 0;
        int idx = 0;
        int count = 0;
        int oCount = 0;
        
        for(int i = 0; i < str.length; i++) {
            String tmp = str[idx];
            
            if(tmp.equals(str[i])) count++;
            else oCount++;
            
            if(count == oCount) {
                answer++;
                count = 0;
                oCount = 0;
                idx = i + 1;
            }
        }
        
        if(idx < str.length) answer++;
        
        return answer;
    }
}