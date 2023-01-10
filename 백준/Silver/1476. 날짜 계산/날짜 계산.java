import java.util.*;
import java.io.*;


public class Main
{
    /**
     * BruteForce Algorithm
     * 2023-01-09
     *
     * @author JY
     * https://www.acmicpc.net/problem/1476
     */

    // 1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int e_start = 1;
        int s_start = 1;
        int m_start = 1;
        int yearCount = 1;

        while(true){
            if(e_start == E && s_start == S && m_start == M){
                System.out.println(yearCount);
                break;
            } else {
                yearCount++;
            }

            e_start++;
            s_start++;
            m_start++;


            if(e_start > 15){
                e_start = 1;
            }
            if(s_start > 28){
                s_start = 1;
            }
            if(m_start > 19){
                m_start = 1;
            }


        }

    }


}

