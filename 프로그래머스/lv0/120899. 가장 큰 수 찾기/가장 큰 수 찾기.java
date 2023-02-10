class Solution {
    public int[] solution(int[] array) {
        
        int index = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                index = i;
                max = array[i]; 
            }
        }        
        
        return new int[] {max, index};
    }
}