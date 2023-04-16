import java.util.*;

class Solution {
    /**
    * 1. 문제 이해하기
    * - 1 ~ n 까지의 사람이 영어 끝말잇기를 진행한다.
    * - 규칙은 다음과 같다.
    *    1. 1 ~ n 까지 순차적으로 단어를 말한다.
    *    2. 마지막 사람이 단어를 말한 다음에는 다시 1번 부터 시작한다
    *    3. 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 한다.
    *    4. 같은 단어 사용 불가 (사용 했는지 확인할 자료 구조 필요 Map)
    *    5. 한 글자 인정 안됨. (s.length() != 1)
    * - 출력 [가장 먼저 탈락하는 사람의 번호, 탈락한 사람이 말한 단어의 마지막 번호]
    * 2. 제한 사항
    * - 2 <= n <= 10
    * - n <= words.length <= 100
    * - 2 <= words[i].length() <= 50
    * - 모든 단어는 알파벳 소문자
    * - 단어 자체는 무의미
    * - 탈락자가 없다면 [0, 0] 출력
    */
    
    public int[] solution(int n, String[] words) {
        
        // 3. 계획
        // words 배열을 순회하면서 현재 사람의 번호(cur)을 증가 시킨다 (n 을 넘어가면 다시 1)
        // HashMap을 사용하여 사용한 단어를 저장하고 확인한다.
        // 3 - 1. 예외 처리
        // - 끝말과 다른 단어인 경우 return
        // - 똑같은 단어를 사용한 경우 return
        // 모든 배열이 순회된다면, [0, 0]을 return 한다.
        
        Map<String, Integer> map = new HashMap<>();
        
        int cur = 1;
        for(int i = 0; i < words.length; i++) {
            if(cur == n + 1) cur = 1;
            
            if(map.containsKey(words[i])) return new int[] {cur, i / n + 1};
            
            if(!map.isEmpty() &&
               words[i - 1].charAt(words[i - 1].length() - 1)!= words[i].charAt(0)) 
                return new int[] {cur, i / n + 1};
            
            map.put(words[i], 1);
            cur++;
        }

        return new int[] {0, 0};
    }
}