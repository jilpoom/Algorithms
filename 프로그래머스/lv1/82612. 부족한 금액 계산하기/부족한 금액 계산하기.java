class Solution {
    public long solution(int price, int money, int count) {
        long N = (count + 1) * count / 2;     
        
        long answer = money - price * N;

        return answer > 0 ? 0 : -answer;
    }
}