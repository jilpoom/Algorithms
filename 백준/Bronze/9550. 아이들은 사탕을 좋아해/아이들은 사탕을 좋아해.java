import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int candyKindCount = sc.nextInt();
            int allowedCandyCount = sc.nextInt();
            int[] candyCountArray = new int[candyKindCount];

            for (int j = 0; j < candyCountArray.length; j++) {
                int candyCount = sc.nextInt();
                candyCountArray[j] = candyCount / allowedCandyCount;
            }

            System.out.println(ArraySum(candyCountArray));
        }

    }

    public static int ArraySum(int[] intArray) {
        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        return sum;
    }
}