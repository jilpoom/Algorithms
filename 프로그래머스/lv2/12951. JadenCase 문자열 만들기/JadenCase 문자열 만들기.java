class Solution {
    // 1. 문제 이해
    // JadenCase : 모든 단어의 첫 문자가 대문자, 그 외의 알파벳은 소문자.
    // 첫 문자가 알파벳이 아닐 때 (ex. "3people"), 이어지는 알파벳은 소문자.
    // String JadenCase(s) 메서드 만들기.
    
    // 1 <= s.length() <= 200
    // s : [A-Za-z0-9] + ... + " "
    // 제한 사항
    //  - 숫자는 단어 첫문자만 나온다. -> String.toLowerCase() or Character.toLowerCase();
    //  - 숫자로만 이루어지는 단어는 없다. -> 숫자로만 이루어진 단어인지 판단 안해도 됨.
    //  - 공백 문자가 연속해서 나올 수 있다. -> split(" ") 메서드 사용 불가. (공백의 개수를 특정할 수 없다.)
    
    public String solution(String s) {
        String answer = "";
        // 2. 계획
        // 2 - 1 char[] 배열부터 순차적으로 탐색 (sliding window, lt, rt)
        char[] charArr = s.toCharArray();
        int lt = 201; // 절대 있을 수 없는 인덱스
        
        answer += Character.toUpperCase(charArr[0]); // 처음값 UppderCase(), 숫자여도 그냥 지나간다.
        
        for(int i = 1; i < charArr.length; i++) {
            if(charArr[i] == ' ') { // 2 - 2 - 1 공백인 경우
                answer += ' ';
            } else {  // 2 - 3 - 2 공백이 아닌 경우 (그전 문자가 공백이거나, 숫자였다면) 처음 문자 인덱스를 변수에 저장
                if(charArr[i - 1] == ' ') lt = i;
                if(i != lt) answer += Character.toLowerCase(charArr[i]); // 만약 lt 가 첫문자가 아니라면
                else answer += Character.toUpperCase(charArr[i]);
            }
        }
        
        
        return answer;
    }
}