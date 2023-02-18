import java.util.stream.*;

class Solution {
    public long solution(int a, int b) {
        return a > b ? LongStream.range(b, a + 1).sum() : LongStream.range(a, b + 1).sum();
    }
}