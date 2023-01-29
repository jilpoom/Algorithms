class Solution {
    public int solution(int n) {
        return n / GCD(n, 6);
    }

    public int GCD(int n1, int n2) {

        if (n1 % n2 == 0) {
            return n2;
        }

        return GCD(n2, n1 % n2);
    }
}