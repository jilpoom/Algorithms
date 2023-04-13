import java.util.*;

class Solution {
    
    char[][] keypad = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'},
        {'*', '0', '#'}
    };
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        Pos leftPos = new Pos(3, 0);
        Pos rightPos = new Pos(3, 2);
        
        Map<Integer, Pos> map = new HashMap<>();
        
        for(int i = 0; i < keypad.length; i++) {
            for(int j = 0; j < keypad[i].length; j++) {
                map.put(keypad[i][j] - 48, new Pos(i, j));
            }
        }
        
        for(int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            
            if(num == 1 || num == 4 || num == 7) {
                answer += "L";
                leftPos = map.get(num);
            } else if (num == 3 || num == 6 || num == 9) {
                answer += "R";
                rightPos = map.get(num);
            } else {
                Pos pos = map.get(num);
                int leftD = leftPos.getDistance(pos);
                int rightD = rightPos.getDistance(pos);
                
                if(leftD > rightD) {
                    answer += "R";
                    rightPos = pos;
                } else if (leftD == rightD) {
                    
                    if(hand.equals("right")) {
                        answer += "R";
                        rightPos = pos;
                    } else {
                        answer += "L";
                        leftPos = pos;
                    }
                    
                } else {
                    answer += "L";
                    leftPos = pos;
                }
                
            }
            
        }
        
        
        return answer;
    }
    
}

class Pos {
    int x;
    int y;
    
    Pos(int x, int y) {
        this.x = x;
        this.y = y;
    };
    
    int getDistance(Pos o) {
        return Math.abs(this.x - o.x) + Math.abs(this.y - o.y);
    };
    
}