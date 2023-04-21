class Solution {
    // 1. 문제 이해하기
    // - 행렬의 곱을 수행하라.
    // 2. 제한 사항
    // - 2 <= arr1.length, arr2.length <= 100
    // - -10 <= arr1[i], arr2[i] <= 20
    // - 곱할 수 있는 배열만 주어진다.
    
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        
        // 3. 계획
        // 행렬의 곱
        // arr1 (a * b) 행렬이고, arr2가 (b * c) 행렬이라면, 결과는 (a * c) 가 된다.
        answer = new int[arr1.length][arr2[0].length];
        
        
        for(int i = 0 ; i < arr1.length ; i++){
              for(int j = 0 ; j < arr2[0].length ; j++){
                  for(int k = 0 ; k < arr1[0].length ; k++) {
                      answer[i][j] += arr1[i][k] * arr2[k][j];
                  }
              }
        }
        
        
        
        return answer;
    }
}