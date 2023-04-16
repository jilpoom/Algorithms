import java.util.*;
import java.util.stream.Collectors;

class Solution
{
    /*
    * 1. 문제 이해하기
    * - 두 개의 배열에서 각각의 요소를 뽑아 곱한 값을 누적하여 최소가 되는 것을 찾는다.
    * 1 - 1 제한 사항
    * - 하나를 뽑으면, 해당 요소는 다시 뽑을 수 없다.
    * - 1 <= A.length, B.length <= 1000
    * - 1 <= A[i].length, B[i].length <= 1000
    * 1 - 2 시간 복잡도
    * - n(n - 1) / 2 := O(n^2) : 두 수를 찾는데 하나의 배열의 길이만큼 걸린다면..
    **/
    
    
    public int solution(int []A, int []B)
    {
        // 2. 계획 1 - 시간 초과
        // 2 - 1 A를 오름차순, B를 내림차순으로 정렬한다.
        // 2 - 2 요소를 차례대로 더해준다.

        Arrays.sort(A);
        Arrays.sort(B);
        
        int answer = 0; // 최대 값은 1,000,000,000이다. int형 선언
        
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }
        
        
        return answer;
    }
}