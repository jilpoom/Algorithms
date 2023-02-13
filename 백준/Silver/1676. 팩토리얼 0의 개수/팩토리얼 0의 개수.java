import java.math.BigInteger;
import java.util.*;


public class Main {
    /**
     * BruteFroce Algorithm
     * 2023-02-13
     *
     * @author JY
     * https://www.acmicpc.net/problem/1676
     */


    static int N;

    static BigInteger[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new BigInteger[N + 1];

        arr[0] = new BigInteger("1");

        for (int i = 1; i < N + 1; i++) {
            arr[i] = arr[i - 1].multiply(new BigInteger(i + ""));
        }


        String[] lines = arr[N].toString().split("");

        int count = 0;

        for (int i = lines.length - 1; i >= 0; i--) {
            if (lines[i].equals("0")) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }


}

