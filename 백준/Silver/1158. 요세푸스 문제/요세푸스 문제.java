import java.util.*;
import java.io.*;


public class Main {
    /**
     * Data Structure
     * Stack
     * 2023-01-17
     *
     * @author JY
     * https://www.acmicpc.net/problem/1158
     */

    static Queue<Integer> myQueue;
    static ArrayList<Integer> ansList;
    static int N;
    static int K;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        myQueue = new LinkedList<>();
        ansList = new ArrayList<>();

        for(int i = 1; i <= N; i++){
            myQueue.add(i);
        }

        // TODO: 순서대로 K번째 사람을 제거

        int count = 0;
        while(!myQueue.isEmpty()){
            count++;

            if(count == K){
                ansList.add(myQueue.poll());
                count = 0;
            } else {
                myQueue.add(myQueue.poll());
            }
        }

        System.out.println(ansList.toString().replace("[", "<").replace("]", ">"));

    }

}
