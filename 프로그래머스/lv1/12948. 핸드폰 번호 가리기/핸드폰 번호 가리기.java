class Solution {
    public String solution(String phone_number) {
        int mod = phone_number.length() - 4;  
        return "*".repeat(mod) + phone_number.substring(mod, phone_number.length());
    }
}