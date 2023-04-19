import java.util.*;

class Solution {
    // 1. 문제 이해하기
    // - n개의 수의 최소공배수를 구하라.
    // 2. 제한 사항
    // 1 <= arr.length <= 15
    // 1 <= arr[i] <= 100
    
    public int solution(int[] arr) {
        int answer = 0;
        
        // 3. 계획
        // Stack을 이용한다.
        // a, b 가 임의의 정수일 때
        // LCM(a, b) * GCD(a, b) = a * b를 만족하므로
        // 모든 원소를 stack에 넣고, 두 원소를 pop()하고 해당 수의 최소 공배수를 push()하며 반복한다.
        // 마지막 원소가 남을 때까지 반복한다.
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr) stack.push(i);
        
        while(stack.size() != 1) {
            int a = stack.pop();
            int b = stack.pop();
            int gcd = GCD(Math.max(a, b), Math.min(a, b));
            stack.push((a * b) / gcd);
        }
        
        
        return stack.pop();
    }
    
    public int GCD(int a, int b) {
        if (a % b == 0) return b;
        return GCD(b, a % b);
    }
    
}