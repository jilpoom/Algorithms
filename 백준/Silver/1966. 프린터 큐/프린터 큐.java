import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-06
     * @author JY
     * https://www.acmicpc.net/problem/1966
     */


    static Queue<Node> myQueue;
    static int[] importantArray;
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int testCase = Integer.parseInt(st.nextToken());

        for(int i = 0; i < testCase; i++){

            st = new StringTokenizer(bf.readLine());
            int N = Integer.parseInt(st.nextToken());
            int t_pos = Integer.parseInt(st.nextToken());

            myQueue = new LinkedList<>();
            importantArray = new int[N];


            st = new StringTokenizer(bf.readLine());

            for(int j = 0; j < N; j++){
                int important = Integer.parseInt(st.nextToken());
                importantArray[j] = important;
                myQueue.add(new Node(j, important));
            }

            Arrays.sort(importantArray);

            int ans = 0;
            int import_pos = importantArray.length - 1;

            while(true) {
                if (!myQueue.isEmpty()) {
                    if (myQueue.peek().important == importantArray[import_pos]) {
                        if (myQueue.peek().index == t_pos) {
                            ans++;
                            System.out.println(ans);
                            break;
                        }
                        ans++;
                        import_pos--;
                        myQueue.poll();
                    } else {
                        myQueue.add(myQueue.poll());
                    }

                }
            }
        }





    }

    static class Node{
        int index;
        int important;

        Node(int index, int important){
            this.index = index;
            this.important = important;
        }


    }


}
