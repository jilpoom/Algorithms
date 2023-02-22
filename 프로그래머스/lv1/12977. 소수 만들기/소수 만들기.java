class Solution {
    private static int[] arr;
    private static boolean[] visited;
    private static int count;
    
    public int solution(int[] nums) {
        arr = nums;
        visited = new boolean[nums.length];
        
        DFS(0, 0);
        
        return count;
    }
    
    public void DFS(int n, int depth) {
        if(depth == 3) {
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                if(visited[i]) sum += arr[i]; 
            }
            
            if(isPrime(sum)) count++;
            
            return;
        }
        
        for(int i = n; i < arr.length; i++) {
            
            if(!visited[i]) {
                visited[i] = true;
                DFS(i + 1, depth + 1);
                visited[i] = false;
            }
        }
   
    }

    public boolean isPrime(int n) {
        if(n == 0 || n == 1) {
            return false;
        }
        
        
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(i != n && i != 1) {
                    return false;
                }
            }
        } 
        
        return true;
    }
    
}