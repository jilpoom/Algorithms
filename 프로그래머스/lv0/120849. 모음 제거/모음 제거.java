class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
    
        char[] charArr = my_string.toCharArray();
        
        for(int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'a' ||
              charArr[i] == 'e' || 
              charArr[i] == 'i' ||
              charArr[i] == 'o' ||
              charArr[i] == 'u') continue;
            
            sb.append(charArr[i]);
            
        }

        return sb.toString();
    }
}