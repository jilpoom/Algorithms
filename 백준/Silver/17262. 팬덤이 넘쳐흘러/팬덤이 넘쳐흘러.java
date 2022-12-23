import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        int[][] testCaseArray = new int[testCase][2];

        for (int[] TimeArray : testCaseArray) {
            TimeArray[0] = sc.nextInt();
            TimeArray[1] = sc.nextInt();
        }

        int maxNum = 0;
        int minNum = Integer.MAX_VALUE;

        int maxTime = 0;
        int minTime = 0;


        for (int[] TimeArray : testCaseArray) {
            if (TimeArray[0] > maxNum) {
                maxNum = TimeArray[0];
                minTime = TimeArray[0];
            }

            if (TimeArray[1] < minNum) {
                minNum = TimeArray[1];
                maxTime = TimeArray[1];

            }
        }

        if (maxTime - minTime >= 0) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(maxTime - minTime));
        }


    }

}
