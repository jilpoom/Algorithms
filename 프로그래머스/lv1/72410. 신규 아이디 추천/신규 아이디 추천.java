class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        String c = toLower(new_id);
        System.out.println(c);
        String c3 = second(c);
        System.out.println(c3);
        String c4 = third(c3);
        System.out.println(c4);
        String c5 = forth(c4);
        System.out.println(c5);
        String c6 = fifth(c5);
        System.out.println(c6);
        String c7 = sixth(c6);
        System.out.println(c7);
        return c7;
    }
    
    // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
    public String toLower(String new_id) {
        char[] c = new_id.toCharArray();
        String answer = "";
        for(int i = 0; i < c.length; i++) {
            if(Character.isUpperCase(c[i])) c[i] = Character.toLowerCase(c[i]);
            
            answer += c[i];
        }
        return answer;
    }
    
    // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    public String second(String new_id) {
        char[] c = new_id.toCharArray();
        String answer = "";
        for(int i = 0; i < c.length; i++) {
            if(!Character.isDigit(c[i]) 
              && !Character.isLowerCase(c[i]) 
              && c[i] != '-'
              && c[i] != '_'
              && c[i] != '.' ) continue;
            
            answer += c[i];
        }
        return answer;
    }
    
    // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    public String third(String new_id) {
        String start = new_id.replaceAll("[.][.]", ".");
        String end = start.replaceAll("[.][.]", ".");
        
        while(!start.equals(end)) {
            start = end.replaceAll("[.][.]", ".");
            end = start.replaceAll("[.][.]", ".");
        }
    
        return end;
    }
    
    
    // 4 단계 : new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    // 5 단계 : new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
    public String forth(String new_id) {
        if(new_id.equals(".") || new_id.equals("")) return "a";
        
        
        if(new_id.charAt(0) == '.') {
            new_id = new_id.substring(1, new_id.length());
        }
        if(new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);   
        };
        return new_id;
    }
    
    //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
    //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
    public String fifth(String new_id) {
        if(new_id.length() >= 16) new_id = new_id.substring(0, 15);
        
        return new_id.charAt(new_id.length() - 1) == '.' ? new_id.substring(0, new_id.length() - 1) : new_id;
    }
    
    // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
    
    public String sixth(String new_id) {
        if(new_id.length() <= 2) {
            while(new_id.length() < 3) {
                new_id += new_id.charAt(new_id.length() - 1);
            } 
        }
        return new_id;
    }
}