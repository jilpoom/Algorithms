class Solution {
    public int solution(int i, int j, int k) {
        String kStr = String.valueOf(k);
        int answer = 0;
        
        for(int x = i; x <= j; x++) {
            String xStr = String.valueOf(x);
            answer += countChar(kStr, xStr);
            
        }
        
        return answer;
    }
    
    public int countChar(String c, String str) {
        int count = 0;
        String[] strArr = str.split("");
        
        for(int i = 0; i < strArr.length; i++) {
            if(c.equals(strArr[i])) count++;
        }
        
        return count;
    }
    
}