class Solution {
    public int solution(String t, String p) {
        int count = 0;
        
        for(int i = 0; i < t.length() - p.length() + 1; i++) {
            String s = t.substring(i, p.length() + i);
            
            long temp = Long.parseLong(s);
            
            if(temp <= Long.parseLong(p)) {
                count++;
            }
            
        }
        return count;
    }
}