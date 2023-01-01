import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Result = 0;

        st = new StringTokenizer(br.readLine());

        long[] A = new long[N];
        for(int i = 0; i < N; i++){
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);

//        int endPoint = N - 1;
//        int startIndex = 0;
//        int endIndex = N - 2;
//        int count = 0;
//
//        while(endPoint >= 2){
//            if(A[startIndex] + A[endIndex] == A[endPoint]){
//                count++;
//                endPoint--;
//                startIndex = 0;
//                endIndex = endPoint - 1;
//            } else if(A[startIndex] + A[endIndex] < A[endPoint]){
//                startIndex++;
//            } else if(A[startIndex] + A[endIndex] > A[endPoint]){
//                endIndex--;
//            } else if(startIndex >= endIndex){
//                endPoint--;
//                startIndex = 0;
//                endIndex = endPoint - 1;
//            }
//        }

        for(int k = 0; k < N; k++) {
            long find = A[k];
            int i = 0;
            int j = N - 1;
            
            //twoPointer
            while (i < j) {
                if (A[i] + A[j] == find) {
                    //find는 서로 다른 두 수의 합이어야 함.
                    if (i != k && j != k) {
                        Result++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (A[i] + A[j] < find) {
                    i++;
                } else {
                    j--;
                }
            }

        }

        System.out.println(Result);
        br.close();

    }

}

