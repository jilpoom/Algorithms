import java.io.*;
import java.util.*;
public class Main{

    static PriorityQueue<Integer> pQueue;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        pQueue = new PriorityQueue<>(((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if(first_abs == second_abs) return o1 > o2 ? 1 : -1; // 절대값이 같으면 음수 우선정렬
            else return first_abs - second_abs; // 절대값 기준 정렬
        }));


        for(int i = 0; i < N; i++){
            int req = sc.nextInt();

            if(req == 0){
                if(pQueue.isEmpty()){
                    System.out.println("0");
                } else {
                    System.out.println(pQueue.poll());
                }
            } else {
                pQueue.add(req);
            }



        }


    }
}