class Solution {
    public int solution(int n) {
        int count = 1;
        int facto = 1;
        while(true) {
            if(facto <= n){
             facto *= ++count;
            } else {
                count--;
                break;
            }

        }

        return count;
    }
}