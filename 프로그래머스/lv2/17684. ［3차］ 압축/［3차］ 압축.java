import java.util.*;

class Solution {
    /**
    * 1. LZW
    * - 길이가 1인 모든 단어를 포함하도록 사전을 초기화한다.
    * - 사전에서 현재 입력과 일치하는 가장 긴 문자열을 찾는다.
    * - w에 해당하는 사전의 색인 번호 출력, 입력에서 w 제거
    * - 입력에서 처리되지 않은 다음 글자(c)가 남아 있다면, w + c 를 사전에 등록
    * 2. 제한 사항
    * - msg는 영문 대문자로만 이루어짐.
    * - 1 <= msg.length() <= 1,000
    */
    
    public int[] solution(String msg) {        
        Map<String, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < 26; i++) {
            map.put( (char) ('A' + i) + "", i + 1);
        }
        
        int idx = 26;
        
        for(int i = 0; i < msg.length(); i++) {
            int lt = 1;
            while(i + lt <= msg.length() && map.containsKey(msg.substring(i, i + lt))) lt++;
            
            if(i + lt > msg.length()) {
                answer.add(map.get(msg.substring(i)));
                break;
            };
            
            answer.add(map.get(msg.substring(i, i + lt - 1)));
            map.put(msg.substring(i, i + lt), ++idx);
            if(lt > 1) i += lt - 2;
        }

        
        return answer.stream().mapToInt(i -> i).toArray();
    }
    
    
}
