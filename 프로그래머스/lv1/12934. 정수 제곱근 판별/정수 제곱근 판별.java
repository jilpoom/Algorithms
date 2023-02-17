class Solution {
    public long solution(long n) {
        long num1 = (long) Math.pow((long) Math.sqrt(n), 2);
        
        return num1 == n ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }
}