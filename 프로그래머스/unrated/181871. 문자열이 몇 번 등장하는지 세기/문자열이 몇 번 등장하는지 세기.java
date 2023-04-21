class Solution {
    public int solution(String myString, String pat) {
        
        int rt = pat.length();
        int count = 0;
        for(int lt = 0; lt < myString.length() - pat.length() + 1; lt++) {
            String s = myString.substring(lt, rt);
            if(s.equals(pat)) count++;
            rt++;
        }

        return count;
    }
}