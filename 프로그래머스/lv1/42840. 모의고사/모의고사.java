import java.util.*;

class Solution {
    private int[] first = {1, 2, 3, 4, 5};
    private int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
    private int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    
    public ArrayList solution(int[] answers) {
        
        int firstCnt = 0;
        int secondCnt = 0;
        int thirdCnt = 0;
        int firstPointer = 0;
        int secondPointer = 0;
        int thirdPointer = 0;
        
        
        for(int i = 0; i < answers.length; i++) {
            int cor = answers[i];
            
            firstPointer = firstPointer >= first.length ? 0 : firstPointer;
            secondPointer = secondPointer >= second.length ? 0 : secondPointer;
            thirdPointer = thirdPointer >= third.length ? 0 : thirdPointer;   
            
            if(cor == first[firstPointer]) {
                firstCnt++;
            }
            
            if(cor == second[secondPointer]){
                secondCnt++;
            }
            
            if(cor == third[thirdPointer]) {
                thirdCnt++;
            }
            
            firstPointer++;
            secondPointer++;
            thirdPointer++;
            
        }
        
        
        int max = Math.max(firstCnt, Math.max(secondCnt, thirdCnt));
        
        ArrayList<Integer> arr = new ArrayList<>();            
            
        
        if(max == firstCnt) {
            arr.add(1);
        }
        if(max == secondCnt) {
            arr.add(2);
        }
        if(max == thirdCnt) {
            arr.add(3);
        }
        
        Collections.sort(arr);
        
        return arr;
    }
    
    
}