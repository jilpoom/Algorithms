
import java.io.*;
import java.util.*;

public class Main {

    /*
    *
    * 1부터 n까지에 수에 대해 차례로 [push, push, push, push, pop, pop, push, push, pop, push, push, pop, pop, pop, pop, pop]
    * 연산을 수행하면 수열 [4, 3, 6, 8, 7, 5, 2, 1]을 얻을 수 있다.
    * */


    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        StringBuffer bf = new StringBuffer();
        Stack<Integer> stack = new Stack<>();

        int number = 1; // 오름차순 수
        boolean result = true;

        for(int i = 0 ; i < A.length; i++){
            int curNumber = A[i]; // 현재 수열의 수
            if(curNumber >= number){
                while(curNumber >= number) { // 오름차순 수가 현재 수열의 수와 같아질 때 까지
                    stack.push(number++);
                    bf.append("+\n");
                }

                stack.pop(); // 같아지면 pop()을 해서 수열을 뽑아낸다.
                bf.append("-\n");
            }
            else {
                int vertex = stack.pop(); //

                if(vertex > curNumber){
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }

        }

        if (result) System.out.println(bf.toString());


    }


}