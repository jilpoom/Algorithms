class Solution {
    public String[] solution(String[] quiz) {
        
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] oper = quiz[i].split(" ");
            int x = Integer.parseInt(oper[0]);
            int y = Integer.parseInt(oper[2]);
            int z = Integer.parseInt(oper[4]);
            
            
            if(oper[1].equals("+") && x + y == z)
                answer[i] = "O";
            
            else if(oper[1].equals("-") && x - y == z)
                answer[i] = "O";
            
            else 
                answer[i] = "X";
        }
        
        
        return answer;
    }
}