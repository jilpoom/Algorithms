class Solution {
    int count;
    
    public void DFS(int depth, int sum, int[] numbers, int target) {
        if(depth == numbers.length) {
            if(sum == target) count++;
        } else {
                
                DFS(depth + 1, sum + numbers[depth], numbers, target);
                DFS(depth + 1, sum - numbers[depth], numbers, target);
                
            }
        
    }
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        DFS(0, 0, numbers, target);
        answer = count;
        return answer;
    }
}