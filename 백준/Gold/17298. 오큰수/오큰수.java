import java.io.*;
import java.util.*;

public class Main {

    //오큰수
    //자료구조 없이 풀었을 때.
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//
//        int N = Integer.parseInt(st.nextToken());
//
//        st = new StringTokenizer(bf.readLine());
//        int[] A = new int[N];
//
//        for(int i = 0; i < N; i++){
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//
//        //비교할 수
//        int curIndex = 1;
//
//        for(int i = 0; i < A.length; i++){
//            int curValue = A[i];
//
//            while(true){
//               if(curIndex == N){
//                   System.out.printf("%d ", -1);
//                   curIndex = i + 1;
//                   break;
//               } else if(curValue >= A[curIndex]) {
//                   curIndex++;
//               } else {
//                   System.out.printf("%d ", A[curIndex]);
//                   curIndex = i + 1;
//                   break;
//               }
//
//            }
//
//
//        }
//
//
//
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] A = new int[n]; // 수열 배열
        int[] ans = new int[n]; // 정답 배열

        String[] str = bf.readLine().split(" ");

        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> myStack = new Stack<>();

        myStack.push(0); //처음 인덱스값 push

        for(int i = 1; i < n; i++){
            while(!myStack.isEmpty() && A[myStack.peek()] < A[i]){ // stack이 비어있지 않고, 현재 수열 값이 top에 해당하는 수열보다 클 때까지
                ans[myStack.pop()] = A[i]; // 정답 배열에 오큰수 저장
            }
            myStack.push(i);

        }
        while(!myStack.isEmpty()){
            //반복문을 나왔으 때, 스택이 비어있지 않다면

            ans[myStack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < n; i++){
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }


}