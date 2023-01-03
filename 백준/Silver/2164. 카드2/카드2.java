import java.io.*;
import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            queue.offer(i);
        }

        // 4, 3, 2, 1
        while(queue.size() > 1){
            queue.poll();
            int vertex = queue.poll();
            queue.offer(vertex);
        }

        System.out.println(queue.poll());




    }
}