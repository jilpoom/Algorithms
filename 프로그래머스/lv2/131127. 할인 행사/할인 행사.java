import java.util.*;

class Solution {
    /**
    * 1. 문제 이해하기
    * - 원하는 제품과 수량이 할인하는 날짜와 10일 연속으로 일치하는 경우, 회원 가입
    * - 할인 조건
    *   - 일정 금액 지불 이후 10일 동안 회원 자격, 매일 한 가지 제품 할인
    *   - 하루에 하나만 구매 가능
    * 2. 제한 조건
    * - 1 <= want.length = number.length <= 10
    * - 1 <= number[i] <= 10, number[i]의 총합은 10
    * - 10 <= discount <= 100,000
    * - 1 <= want[i].length, discount[i].length <= 12
    */
    
    public int solution(String[] want, int[] number, String[] discount) {
        // 3. 계획
        // - 해쉬맵과 슬라이딩 윈도우로 접근한다.        
        
        Map<String, Integer> wantMap = wantToMap(want, number);
        Map<String, Integer> saleMap = saleMapInit(discount);
        
        
        int answer = 0;
        
        if(isEquals(wantMap, saleMap)) answer++;
        
        for(int i = 1; i < discount.length - 9; i++) {
            
            saleMap.put(discount[i - 1], saleMap.get(discount[i - 1]) - 1);
            
            saleMap.put(discount[10 + i - 1], saleMap.getOrDefault(discount[10 + i - 1], 0) + 1);
            
            if(isEquals(wantMap, saleMap)) answer++;

        }
    
        
        return answer;
    }
    
    public Map<String, Integer> wantToMap(String[] want, int[] number) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        return map;
    }
    
    public Map<String, Integer> saleMapInit(String[] discount) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < 10; i++) {
            map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
        }
        
        return map;
    }
    
    public boolean isEquals(Map<String, Integer> map1, Map<String, Integer> map2){
        for(String key : map1.keySet()) {
            if(!map2.containsKey(key) || map1.get(key) != map2.get(key)) return false;
        }
        return true;
    }
    
}