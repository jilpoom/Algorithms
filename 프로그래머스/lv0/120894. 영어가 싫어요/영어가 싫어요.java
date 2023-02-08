class Solution {
    public long solution(String numbers) {
        String[] line = numbers.split("");
        String answer = "";
        String num = "";
        for(int i = 0; i < line.length; i++) {
            
            num += line[i];
            
            switch(num) {
                case "one":
                    answer += "1";
                    num = "";
                    break;
                case "two":
                    answer += "2";
                    num = "";
                    break;
               case "three":
                    answer += "3";
                    num = "";
                    break;
                case "four":
                    answer += "4";
                    num = "";
                    break;
                case "five":
                    answer += "5";
                    num = "";
                    break;
                case "six":
                    answer += "6";
                    num = "";
                    break;
                case "seven":
                    answer += "7";
                    num = "";
                    break;
                case "eight":
                    answer += "8";
                    num = "";
                    break;
                case "nine":
                    answer += "9";
                    num = "";
                    break;
                case "zero":
                    answer += "0";
                    num = "";
                    break;
                
            }
            
        }
        
        
        
        return Long.parseLong(answer);
    }
}