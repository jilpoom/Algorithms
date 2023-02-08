class Solution {
    public String solution(String my_string) {
        char[] A = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();        
        
        for(int i = 0; i < A.length; i++) {
            if(A[i] >= 'A' && A[i] <= 'Z') {
                A[i] += 32;
            } else if (A[i] >= 'a' && A[i] <= 'z') {
                A[i] -= 32;
            }
            
            sb.append(A[i]);
           
        }
        

        return sb.toString();
    }
}