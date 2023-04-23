class Solution {
    public int solution(int a, int b) {
        int num = Integer.parseInt("" + a + b);
        return num  == 2 * a * b ? 2 * a * b : Math.max(num, 2 * a * b);
    }
}