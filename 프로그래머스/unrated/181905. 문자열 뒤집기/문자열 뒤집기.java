class Solution {
    public String solution(String my_string, int s, int e) {
        String reverse = my_string.substring(s, e + 1);
        
        return my_string.substring(0, s) + new StringBuilder().append(reverse).reverse()
            + my_string.substring(e + 1, my_string.length());
    }
}