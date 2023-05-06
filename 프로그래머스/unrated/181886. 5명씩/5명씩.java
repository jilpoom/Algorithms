class Solution {
    public String[] solution(String[] names) {
        int count = 0;
        String[] ans = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
        for(int i = 0; i < names.length; i++) {
            if(i % 5 == 0){
                ans[count] = names[i];
                count++;
            } 
        }
        return ans;
    }
}