class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] lines = polynomial.split(" ");
        
        int xs = 0;
        int a = 0;
        
        for(int i = 0; i < lines.length; i++) {
            if(lines[i].contains("x")) {
                
                if(lines[i].equals("x")) {
                    xs += 1;
                } else {
                    xs += Integer.parseInt(lines[i].replace("x", ""));
                }         
                
            } else if(!lines[i].equals("+")) {
                a += Integer.parseInt(lines[i]);
            }
     
        }

        if(xs == 0) {
            
            if(a == 0) {
                answer = "0";
            } else {
                answer = a + "";
            }
 
        } else if (xs == 1) {
            
            if (a == 0) {
                answer = "x";
            } else {
                answer = "x + " + a;
            }
   
        } else {
            if(a == 0) {
                answer = xs + "x";
            } else {
                answer = xs + "x + " + a;
            }         
            
        }
        
        
  
        return answer;
    }
}