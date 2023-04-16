class Solution {
    
    int[] fibo;
    
    public int fibo(int n) {
        if(fibo[n] == 0) return fibo[n] = (int) ((fibo(n - 1) + fibo(n - 2)) % 1234567);
        return fibo[n];
    }
    
    public int solution(int n) {
        fibo = new int[100_001];
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;
        return fibo(n);
    }
}