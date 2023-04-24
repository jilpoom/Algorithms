import java.util.*;

class Solution {
    
    /**
    * 1. 문제 이해하기
    * - 입력된 두 문자 사이의 자카드 유사도(0 ~ 1 사이의 실수)에 65536을 곱한 후 정수부만 출력한다.
    * - 자카드 유사도의 정의
    *   - 문자열 A, B의 자카드 유사도를 J(A, B)라고 할 때,
    *   - A와 B의 교집합 / A와 B의 합집합
    *   - 단, 모두 공집합일 경우 자카드 유사도는 1이다.
    * 
    * 2. 제한 사항
    * - 2 <= str1, str2 <= 1,000
    * - 두 글자씩 끊어 다중 집합의 원소로 만들되, 영문자 외의 모든 문자가 포함된 경우는 버린다.
    * - 대문자와 소문자의 차이는 무시한다.
    */

    public int solution(String str1, String str2) {
        int answer = 0;
        
        // 3. 계획
        // - str1, str2가 영문자가 아닌 경우를 하나의 값으로 대체한다.
        str1 = str1.replaceAll("[^A-Za-z]", "0");
        str2 = str2.replaceAll("[^A-Za-z]", "0");
        
        ArrayList<String> str1List = strParse(str1);
        ArrayList<String> str2List = strParse(str2);
        
        // 공집합인 경우 예외 처리
        if(str1List.size() == 0 && str2List.size() == 0) return 65536;
        // 정렬 후 같은 집합인 경우 예외 처리
        
        Collections.sort(str1List);
        Collections.sort(str2List);
        if(str1List.equals(str2List)) return 65536;
        
        System.out.println(str1List);
        System.out.println(str2List);
        
        int intersect = intersect(str1List, str2List);
        int union = union(str1List, str2List, intersect);

        return (int) ((intersect / (double) union) * 65536);
    }
    
    public ArrayList<String> strParse(String str) {
        ArrayList<String> list = new ArrayList<>();
        
        String[] strArr = str.split("");
        
        for(int i = 0; i < strArr.length - 1; i++) {
            if(strArr[i].equals("0") || strArr[i + 1].equals("0")) continue;
            String answer = strArr[i] + strArr[i + 1];
            list.add(answer.toLowerCase());
        }
        
        return list; 
    }
    
    public int intersect(ArrayList<String> list1, ArrayList<String> list2) {
        int idx = 0;
        int count = 0;
        for(int i = 0; i < list1.size(); i++) {
            for(int j = idx; j < list2.size(); j++) {
                if(list1.get(i).equals(list2.get(j))) {
                    count++;
                    idx = j + 1;
                    break;
                }
            }
        }
        return count;
    }
    
    public int union(ArrayList<String> list1, ArrayList<String> list2, int intersect) {
        return list1.size() + list2.size() - intersect;
    }
    
}