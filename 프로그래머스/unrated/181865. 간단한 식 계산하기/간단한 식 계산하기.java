class Solution {
    public int solution(String binomial) {
        String[] s = binomial.split(" ");        
        return operate(Integer.parseInt(s[0]), Integer.parseInt(s[2]), s[1]);
    }
    public int operate(int a, int b, String s) {
        if(s.equals("+")) return a + b;
        if(s.equals("-")) return a - b;
        if(s.equals("*")) return a * b;
        return -1;
    }
}