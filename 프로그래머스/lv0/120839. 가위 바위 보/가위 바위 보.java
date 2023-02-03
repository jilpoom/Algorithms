class Solution {
    public String solution(String rsp) {
        String answer = "";
        // 2 < 0 < 5 < 2
        
        for(int i = 0; i < rsp.length(); i++){
            if(rsp.charAt(i) == '2') {
                answer += "0";
            } else if(rsp.charAt(i) == '5'){
                answer += "2";
            } else {
                answer += "5";
            }
        }
        
        
        return answer;
    }
}