class Solution {
    public int solution(int[] sides) {
        int[] edge = new int[3];
        int max = sides[0];
        
        for(int i = 1; i < 3; i++){
            if(max < sides[i]) {
                edge[i - 1] = 0;
                max = sides[i];
                edge[i] = 1;
            } 
        }
        
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            if(edge[i] != 1) sum += sides[i];
        }
        
        int answer = 0;
        
        if(sum > max){
            answer = 1;
        } else {
            answer = 2;
        }

        
        return answer;
    }
}