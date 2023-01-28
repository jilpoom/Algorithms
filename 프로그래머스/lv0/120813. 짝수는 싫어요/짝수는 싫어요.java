class Solution {
    public int[] solution(int n) {
        int answerLength = (n + 1) / 2;
        
        int[] answer = new int[answerLength];
        
        int count = 0;
        
        for(int i = 1; i <= n; i++){
            if (i % 2 == 1) {
                answer[count++] = i;
            }
        }
        
        return answer;
    }
}