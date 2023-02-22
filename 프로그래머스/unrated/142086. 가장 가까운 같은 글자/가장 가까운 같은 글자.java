class Solution {
    public int[] solution(String s) {
        String[] sArr = s.split("");
        int[] answer = new int[sArr.length];
        
        for(int i = 0; i < sArr.length; i++) {
            if(answer[i] != 0) {
                continue;
            }
            
            String str = sArr[i];
            answer[i] = -1;
            int index = 0;
            
            for(int j = i + 1; j < sArr.length; j++) {
                if(str.equals(sArr[j])) {
                    answer[j] = j - i - index;
                    index = j - i;
                }    
            
            }
            
        }
        
        
        return answer;
    }
}

// 처음 값은 무조건 -1

// 이후 들어오는 값이, 이전의 값과 같은지 판단하고, 아니라면, -1 대입