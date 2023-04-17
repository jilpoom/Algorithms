

class Solution {
    /** 
    * 1. 문제 이해하기
    * - 중앙은 가로가 더 큰 직사각형, 혹은 정사각형, 테두리는 1줄
    * - 입력 [테두리 격자 개수, 중앙 격자 개수] ex.[10, 2]
    * - 출력 [카펫의 가로 길이, 카펫의 세로 길이] ex. [4, 3]
    * 2. 제한 사항
    * - 8 <= brown <= 5,000
    * - 1 <= yellow <= 2,000,000 
    * - 카펫의 가로 >= 카펫의 세로
    */
    
    
    public int[] solution(int brown, int yellow) {
        
        // 3 - 1 계획
        // x가 가로, y가 세로일 때, (x >= y)
        // x * y == yellow 가 성립하는 모든 조합을 찾는다. ex) 24 = [[24, 1], [12, 2], [8, 3], [6, 4]]
        // 모든 조합을 찾을 때는, yellow의 제곱근에 해당되는 숫자까지만 찾는다.
        // (2x + 2) + (2y + 2) == brown이 성립하면, return [x + 2, y + 2]
        
        
        for(int y = 1; y <= Math.sqrt(yellow); y++) {
            int x = getOtherNumber(yellow, y);
            if(x == -1) continue;
            if((2 * x + 2) + (2 * y + 2) == brown) return new int[]{x + 2, y + 2}; 
        }
        
        
        return new int[] {0, 0};
    }
    
    public int getOtherNumber(int yellow, int i) {
        return yellow % i == 0 ? yellow / i : -1;
    }
}