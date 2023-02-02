class Solution {
    public String solution(int age) {
        String strAge = String.valueOf(age);
        StringBuilder sb = new StringBuilder();        
        
        for(int i = 0; i < strAge.length(); i++){
            char c = strAge.charAt(i);
            c = (char) ((int) c + 49);
            sb.append(c);
            
        }
        
        
        return sb.toString();
    }
}