class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr = new String[n];
        
        
        
        for(int i = 0; i < n; i++) {
            arr[i] = ""; // arr[i] ""로 초기화;
            
            String bin1 = toBinary(n, arr1[i]);
            String bin2 = toBinary(n, arr2[i]);
            
            for(int j = 0; j < n; j++) {
                if(bin1.charAt(j) == '1' || bin2.charAt(j) == '1') {
                    arr[i] += "#";
                } else {
                    arr[i] += " ";
                }
            }
            
        }
        
        
        return arr;
    }
    
    
    public String toBinary(int n, int arrValue) {
        
        String bin = Integer.toBinaryString(arrValue);
        
        if(bin.length() < n) {
            bin = "0".repeat(n - bin.length()) + bin;
        }
        
        
            
       return bin;
    }
    
    
}