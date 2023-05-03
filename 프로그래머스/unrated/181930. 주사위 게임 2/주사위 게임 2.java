class Solution {
    public int solution(int a, int b, int c) {
        int a2 = (int) Math.pow(a, 2);
        int b2 = (int) Math.pow(b, 2);
        int c2 = (int) Math.pow(c, 2);
        int a3 = (int) Math.pow(a, 3);
        int b3 = (int) Math.pow(b, 3);
        int c3 = (int) Math.pow(c, 3);
        
        if(a == b && b == c) return (a + b + c) * (a2 + b2 + c2) * (a3 + b3 + c3);
        else if(a == b || b == c || c == a) return (a + b + c) * (a2 + b2 + c2);
        
        return a + b + c;
    }
}