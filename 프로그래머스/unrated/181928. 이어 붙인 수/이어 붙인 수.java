class Solution {
    public int solution(int[] num_list) {
        String str1 = "";
        String str2 = "";
        
        for(int i : num_list) {
            if(i % 2 == 0) str1 += i;
            else str2 += i;
        }
        
        return Integer.parseInt(str1) + Integer.parseInt(str2);
    }
}