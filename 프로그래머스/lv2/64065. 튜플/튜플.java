import java.util.*;

class Solution {
    
    /**
    * 1. 문제 이해하기
    * - 튜플의 조건 (a1, a2, a3, ..., an)
    *   - 중복된 원소가 있을 수 있으며, 순서가 다르면 서로 다르다.
    *   - 튜플의 원소 개수는 유한하다.
    * - 원소의 개수가 n인 튜플은 다음과 같이 집합을 통해 나타낼 수 있다.
    *   - {{a1}, {a1, a2}, {a1, a2, a3}, {a1, a2, a3, a4}, ... {a1, a2, a3, a4, ..., an}}
    *   - 각 집합의 원소들의 순서가 달라져도, 같은 튜플을 나타낸다.
    *   - 1개의 집합 원소가 튜플의 첫 시작이다
    * 2. 제한 사항
    * - 5 <= s <= 1,000,000
    * - s = '{', '}', ',' 로 이루어져있다.
    * - 숫자가 0으로 시작하는 경우는 없다.
    * - 1 <= s[i][j] <= 100,000
    * - 1 <= answer.length <= 500
    */
    
    HashMap<Integer, Integer> map = new HashMap<>();
    
    public int[] solution(String s) {
        // 3. 계획
        // - 원소의 개수가 n인 튜플의 집합 중, 가장 많이 나오는 원소가 튜플의 첫번째 원소에 해당한다.
        // - {{a1}, {a1, a2}, {a1, a2, a3}, {a1, a2, a3, a4}, ... {a1, a2, a3, a4, ..., an}}
        // a1 : n 개 -> a2 : n - 1 개 -> a3...
        // - HashMap을 통해 원소의 개수를 세서, 가장 많이 나오는 원소 순으로 정렬한 후 반환한다.
        // - 이를 위해 s의 전처리 과정이 필요하다.
        // - s에 등장하는 숫자 이후엔 반드시 ','와 '}'가 등장한다.
        // - 이를 이용해서 숫자를 count 한다.
        
        sCount(s);
        
        ArrayList<Node> list = new ArrayList<>();
        
        for(int key : map.keySet()) {
            list.add(new Node(key, map.get(key)));
        }
        
        Collections.sort(list);
         
        return list.stream()
            .mapToInt(node -> node.n)
            .toArray();
    }
    
    public void sCount(String s) {
        
        String str = "";
        
        for(char c : s.toCharArray()) {
            
            if(c == '}' || c == ',') {
                if(str.equals("")) continue;
                
                int num = Integer.parseInt(str);
                map.put(num, map.getOrDefault(num, 0) + 1);
                str = "";
            } 
            
            if(Character.isDigit(c)) str += c;
            
        }
        
    }
    
}

class Node implements Comparable<Node>{
    int n;
    int c;
    
    public Node(int n, int c) {
        this.n = n;
        this.c = c;
    }
    
    public int compareTo(Node o) {
        return o.c - this.c;
    }
}