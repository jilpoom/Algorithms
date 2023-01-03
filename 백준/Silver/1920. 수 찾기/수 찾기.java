import java.io.*;
import java.util.*;
public class Main{
    /**
     * @author 정정용
     *
     * */


//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        StringBuffer sb = new StringBuffer();
//
//        int N = Integer.parseInt(st.nextToken());
//        int[] A = new int[N];
//
//        st = new StringTokenizer(bf.readLine());
//        for(int i = 0; i < N; i++){
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//        //A 정렬
//        Arrays.sort(A);
//
//        st = new StringTokenizer(bf.readLine());
//        int M = Integer.parseInt(st.nextToken());
//
//        st = new StringTokenizer(bf.readLine());
//
//        // 중간 Pointer
//        int mPointer = N / 2;
//
//
//        for(int i = 0; i < M; i++){
//            int m = Integer.parseInt(st.nextToken());
//            while(true){
//                if(m == A[mPointer]){
//                    sb.append("1\n");
//                    break;
//                }
//                else if(mPointer == N - 1 || mPointer == 0){
//                    sb.append("0\n");
//                    break;
//                }
//                else if(m > A[mPointer]){
//                    mPointer = (mPointer + N) / 2;
//                } else if (m < A[mPointer]){
//                    mPointer /= 2;
//                }
//            }
//            mPointer = N / 2;
//
//
//        }
//
//        System.out.print(sb.toString());
//
//    }
//
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int M = sc.nextInt();
        for(int i = 0; i < M; i++){
            boolean find = false;
            int target = sc.nextInt();
            //이진 탐색
            int start = 0;
            int end = A.length - 1;

            while(start <= end){
                int midi = (start + end) / 2;
                int midV = A[midi];
                if(midV > target){
                    end = midi - 1;
                } else if (midV < target){
                    start = midi + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if(find){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }



    }

}