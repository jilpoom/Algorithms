import java.util.*;

class Solution {
    /** 
    * 1. 문제 이해하기
    * - 과학자의 H-Index를 구하라
    * - H-Index의 정의
    *    - 총 논문 개수를 n, 논문 당 인용 횟수를 나열한 배열 citations, H-Index를 h라고 할 때,
    *    - citations[i] >= h를 만족하는 논문의 개수가 H(n)이면
    *    - H(n) <= h
    *    - n - H(n) <= h
    *    - 을 만족하는 h의 최대값
    * 2. 제한 사항
    * - 1 <= n <= 1,000
    * - 0 <= citations[i] <= 10,000
    */  
    
    
    public int solution(int[] citations) {
        
        // 3. 계획
        // - BinarySearch를 사용한다.
        // - citations을 오름차순 정렬한다.
        // - citations[i] >= h의 개수를 반환하는 메서드를 만든다.
        // - h는 1 <= h <= citations[i]의 최대값을 만족한다.
        // - 최대값의 중간값으로부터 BinarySearch를 진행한다.
        
        Arrays.sort(citations);
        
        int lt = 0;
        int rt = citations[citations.length - 1];
        int mid = 0;
        int answer = 0;
        
        while(lt <= rt) {
            mid = (lt + rt) / 2;
            int h = H(mid, citations);
            if(h == -1) {
                rt = mid - 1;
                continue;
            }
            
            if(h >= citations.length - h) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        
        
        return answer;
    }
    
    public int H(int n, int[] citations) {
        int h = 0;
        for(int i : citations) {
            if(n <= i) h++;
        }
        return h >= n ? h : -1;
    }
    
}