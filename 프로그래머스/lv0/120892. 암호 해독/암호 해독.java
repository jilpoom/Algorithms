class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] cipherArr = cipher.split("");
        
        for(int i = code - 1; i < cipherArr.length; i += code) {
            answer += cipherArr[i];
        }        
        
        
        return answer;
    }
}