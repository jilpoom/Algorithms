class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[A-z]", "");
        
        int sum = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            sum += Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }
        
        return sum;
    }
}