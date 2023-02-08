class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        String temp = "";
        
        String[] lines = my_string.split("");
        
        temp += lines[num1];
        lines[num1] = lines[num2];
        lines[num2] = temp;
    
        for(String str : lines) {
            answer += str;
        }
        
        
        return answer;
    }
}