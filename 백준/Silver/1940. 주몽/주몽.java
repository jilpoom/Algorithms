import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] serialArray = new int[N];
        for(int i = 0; i < N; i++){ 
            serialArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(serialArray); // O(nlogn)

        //startIndex, endIndex, count

        //  s
        //[ 1, 2, 3, 4, 5]
        //              e

        int count = 0;
        int i = 0;
        int j = N - 1;

        while (i < j){
            if (serialArray[i] + serialArray[j] < M) {
                i++;
            } else if (serialArray[i] + serialArray[j] > M){
                j--;
            } else {
                count++;
                i++;
                j--;
            }

        }

        System.out.println(count);

        br.close();

    }

}

