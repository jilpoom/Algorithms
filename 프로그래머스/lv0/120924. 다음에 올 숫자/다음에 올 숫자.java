class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int first = common[0];
        int second = common[1];
        int third = common[2];
        
        
        if(second - first == third - second){
            if(first == second && second == third){
                answer = first;
            } else {
                answer += first + (second - first) * common.length;
            }
            
        } else {
            answer = first * (int) Math.pow(second / first, common.length);
        }

        
        return answer;
    }
}