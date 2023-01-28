class Solution {
    int[] arr;
    
    public int solution(int[] array) {
        int answer = 0;
        arr = new int[1001];
        
        for(int i = 0; i < array.length; i++){
            arr[array[i]]++;
        }
        
        int max = 0;
        int maxIndex = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max) count++;
        }
        
        if(count > 1) return -1;
        answer = maxIndex;
        return answer;
    }
}