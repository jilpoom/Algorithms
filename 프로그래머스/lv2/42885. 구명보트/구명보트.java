import java.util.*;

class Solution {
    /**
    * 1. 문제 이해하기
    * - 구명보트를 최대한 적게 사용하여 모든 사람을 구출하라.
    * 2. 제한 사항
    * - 구명보트에는 최대 2명까지 탈 수 있으며, 단 무게 제한을 넘지 않아야 한다.
    * - 1 <= people.length <= 50,000
    * - 40 <= people[i] <= 240
    * - 40 <= limit <= 240
    * - limit > 사람들의 몸무게 중 최대값 
    */
    
    public int solution(int[] people, int limit) {
        
        // 3. 계획 (실패)
        // - people 2명을 조합해, limit을 넘어가는 경우의 수를 센다 (count)
        //    - (반례) [10, 20, 30, 40] -> 차례대로 세어가면 안 된다.
        // - 모든 사람들을 탐색하면 시간 복잡도가 높아지므로 정렬한 후, limit / 2 이하의 사람까지만 탐색한다. (X)
        //    - (반례) [30, 70 ,100]
        // - limit은 사람들의 몸무게 중 최대값보다 크므로, 
        //   모든 사람을 한 명씩 태우는 경우의 수인 people.length가 최대 정답이다.
        // - return people.length - count;
        // - 3 - 2. 예외
        // - 1명인 경우 무조건 1을 반환한다. (반복문 인덱스 참조 방지)
        
        /**
        if(people.length == 1) return 1;
        
        int answer = people.length;
        
        Arrays.sort(people);
        
        for(int i = 1; i < people.length; i += 2) {
            if(people[i] + people[i - 1] <= limit) answer--;
        }
        */
        
        // 3. 계획 (시간 초과 : 거꾸로 찾으면, 최악의 경우 모든 배열을 확인해야 한다.) 
        // - people을 정렬한 후, 한 사람을 선택(n1)하고 매칭되는 사람(n2)을 고른다.
        // n1 + n2가 limit을 넘지 않으며, 최대값이 되는 경우를 찾는다.
        // people = [40, 50, 60, 70], limit = 120 -> [40, 70], [50, 60]
        
        /**
        if(people.length == 1) return 1;
        int answer = people.length;
        int idx = people.length - 1; // 매칭할 인덱스
        
        Arrays.sort(people);
        
        for(int i = 0; i < people.length; i++) {
            if(i > idx) break;
            for(int j = idx; j > i; j--) {
                if(people[i] + people[j] <= limit) {
                    answer--;
                    idx = j - 1; // people[j]의 이전 인덱스 부터 매칭 시작
                    break;
                }
            }
        }
        */
        
        // 3. 계획 
        // - Two Pointer를 활용한다.
        // people = [40, 50, 60, 70], limit = 120 -> [40, 70], [50, 60]
        Arrays.sort(people);
        int lt = 0;
        int rt = people.length - 1;
        int answer = people.length;
        
        while(lt < rt) {
            if(people[lt] + people[rt] <= limit) {
                answer--;
                lt++;
            }
            rt--;
        }

        return answer;
    }
}