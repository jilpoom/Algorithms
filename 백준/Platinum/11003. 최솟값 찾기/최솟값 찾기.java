
import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        Deque<Node> mydeque = new LinkedList<Node>();

        for(int i = 0; i < N; i++){
            int now = Integer.parseInt(st.nextToken());
            // 새로운 값이 들어올 때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거 -> 시간복잡도 줄이기

            while(!mydeque.isEmpty() && mydeque.getLast().value > now){
                mydeque.removeLast();
            }

            mydeque.addLast(new Node(now, i));

            if(mydeque.getFirst().index <= i - L){
                mydeque.removeFirst();
            }
            bw.write(mydeque.getFirst().value + " ");
        }

        bw.flush();
        bw.close();
    }


    static class Node {
        int value;
        int index;

        Node(int value, int index){
            this.value = value;
            this.index = index;
        }


    }


}