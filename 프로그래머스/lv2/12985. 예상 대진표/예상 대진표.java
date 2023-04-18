import java.util.*;

class Solution
{
    /**
    * 1. 문제 이해하기
    * - N명이 참가하는 토너먼트 대회
    * - 배정받은 순서대로 경기를 진행하며, n번, n + 1번 중 승리한 사람이 해당 페어의 번호를 부여 받는다.
    * - 게임은 최종 한명이 나올 때까지 진행된다.
    * 2. 제한 사항
    * - A, B번 참가자가 몇 번째 라운드에서 만나는지 출력
    * - 2^0 <= N은 2의 지수 <= 2^20 (부전승은 없다.)
    * - A, B <= N
    */
    
    
    public int solution(int n, int a, int b)
    {
        // 3. 계획
        // 페어를 만들기 위해, Pair Class를 정의한다.
        // Queue에 모든 페어를 offer하고, 모든 Queue가 반복되었을 경우 라운드 수(round)를 늘린다
        // 대진표에서 a, b 번을 제외한 페어의 승자는 누구든 상관 없다.
        // 단, a, b번 참가자는 항상 다음 라운드로 올라간다.
        
        /**
        Queue<Pair> queue = new LinkedList<>();
        
        for(int i = 1; i < n; i += 2) { // 대진표 초기화
            queue.offer(new Pair(i, i + 1));
        }
        
        int round = 1;
        
        while(queue.size() != 1) {
            
            int len = queue.size();
            
            for(int i = 0; i < len; i += 2) {
                Pair pair1 = queue.poll();
                if(pair1.contains(a) && pair1.contains(b)) return round; 
                Pair pair2 = queue.poll();
                if(pair2.contains(a) && pair2.contains(b)) return round;
                Pair nextPair = new Pair(pair1.x, pair2.x); // 기본값 설정
                
                if(pair1.contains(a)) nextPair.x = a;
                if(pair1.contains(b)) nextPair.x = b;
                if(pair2.contains(a)) nextPair.y = a;
                if(pair2.contains(b)) nextPair.y = b;

                queue.offer(nextPair);
            }
            round++;
            
        }
        */
        
        
        int answer = 0;

        // a와 b 중 작은 번호가 a가 되도록 설정
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // 각 라운드에서 a와 b가 몇 번째 참가자인지 계산
        while (a != b) {
            answer++;
            a = (a + 1) / 2;
            b = (b + 1) / 2;
        }
        
        
        return answer;
    }
    
}

class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean contains(int n) {
        return n == this.x || n == this.y ? true : false;
    }
}