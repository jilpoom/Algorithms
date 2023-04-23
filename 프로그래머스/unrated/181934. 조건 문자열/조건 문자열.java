class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if(n == m && eq.equals("=")) return 1;
        
        int tmp = Math.max(n, m);
        
        if(ineq.equals(">")) {
            if(tmp == n) return 1;
        } else {
            if(tmp == m) return 1;
        }
        
        return 0;
    }
}