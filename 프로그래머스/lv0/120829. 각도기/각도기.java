class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle / 90 == 1){
            if(angle % 90 > 0){
                answer = 3;
            } else {
                answer = 2;
            }
        } else if (angle / 90 == 0) {
            answer = 1;
        } else {
            answer = 4;
        }

        return answer;
    }
}