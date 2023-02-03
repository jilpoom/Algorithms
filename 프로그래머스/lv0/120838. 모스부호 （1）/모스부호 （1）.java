class Solution {
    String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    
    public String solution(String letter) {
        String[] alpha = letter.split(" ");
        String answer = "";
        
        for(int i = 0; i < alpha.length; i++) {
            for(int j = 0; j < morse.length; j++){
                if(morse[j].equals(alpha[i])) {
                    char c = (char) (j + 97);
                    answer += Character.toString(c);
                    break;
                }
            }
            
        }        

        return answer;
    }
}