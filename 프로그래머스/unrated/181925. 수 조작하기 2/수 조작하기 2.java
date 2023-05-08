class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 1; i < numLog.length; i++) {
            int lt = numLog[i - 1];
            int rt = numLog[i];
            
            if(lt + 1 == rt) answer += "w";
            else if (lt - 1 == rt) answer += "s";
            else if (lt + 10 == rt) answer += "d";
            else if (lt - 10 == rt) answer += "a";
        }
        
        
        return answer;
    }
}