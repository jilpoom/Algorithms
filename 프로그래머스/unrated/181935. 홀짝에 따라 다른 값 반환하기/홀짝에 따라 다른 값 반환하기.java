import java.util.stream.*;

class Solution {
    public int solution(int n) {
        
        return n % 2 == 1 ?
            IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).sum() :
            IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).map(i -> (int) Math.pow(i, 2)).sum();
           
            
        
    }
}