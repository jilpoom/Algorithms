import java.io.*;
import java.util.*;

public class Main {
    /**
     * BruteForce Algorithm
     * 2023-01-09
     *
     * @author JY
     * https://www.acmicpc.net/problem/2309
     */

    static boolean[] visited;
    static int[] heightArr;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        heightArr = new int[9];
        visited = new boolean[9];
        ArrayList<Integer> ansArr = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            heightArr[i] = Integer.parseInt(bf.readLine());
        }

        int sum = 0;
        int spyA = 0;
        int spyB = 0;

        for(int i : heightArr){
            sum += i;
        }

        outer: for (int i = 0; i < heightArr.length; i++) {
            for (int j = i + 1; j < heightArr.length; j++) {
                int a = heightArr[i];
                int b = heightArr[j];

                if (sum - a - b == 100) {
                    spyA = i;
                    spyB = j;
                    break outer;
                }
            }

        }

            for (int i = 0; i < 9; i++) {
                if (i != spyA && i != spyB) {
                    ansArr.add(heightArr[i]);
                }
            }


            Collections.sort(ansArr);

            for (int i : ansArr) {
                System.out.println(i);
            }


        }


    }
