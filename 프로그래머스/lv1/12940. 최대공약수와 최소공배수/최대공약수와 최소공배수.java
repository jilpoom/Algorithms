class Solution {
    public int[] solution(int n, int m) {
        
        return new int[] {GCD(n, m), n * m / GCD(n, m)};
    }
    
    
    public int GCD(int n, int m) {
        if(n % m == 0) return m;
        return GCD(m, n % m);
    }
    
}