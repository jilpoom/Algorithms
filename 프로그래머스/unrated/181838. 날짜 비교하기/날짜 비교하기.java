class Solution {
    public int solution(int[] date1, int[] date2) {
        if(date1[0] != date2[0]) {
            if(previous(date1[0], date2[0])) return 1;
        }
        
        else if(date1[1] != date2[1]) {
            if(previous(date1[1], date2[1])) return 1;
        }
        
        else if(date1[2] != date2[2]){
            if(previous(date1[2], date2[2])) return 1;
        }
        
        return 0;
    }
    
    public boolean previous(int x, int y) {
        return x < y;
    }
}