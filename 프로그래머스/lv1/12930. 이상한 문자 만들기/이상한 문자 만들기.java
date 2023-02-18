class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        String answer = "";
        
        int index = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index = 0;
                answer += " ";
                continue;
            }
            
            if(index % 2 == 0) {
                answer += String.valueOf((char) (s.charAt(i) - 32));
            } else {
                answer += String.valueOf(s.charAt(i));
            }
            
            index++;
        }

        
        return answer;
    }
}