class Solution {
    public int solution(int chicken) {
        int answer = 0;   

        
        while(chicken >= 10) {
            int service = chicken / 10;
            int modCoupon = chicken % 10;
            chicken = service + modCoupon;
            answer += service;
            
            
        }
        
        return answer;
    }
}