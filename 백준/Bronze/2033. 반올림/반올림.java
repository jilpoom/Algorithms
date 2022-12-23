import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int inputSize = Integer.toString(input).length();
        int exponent = 1;


        while (exponent < inputSize) {
            int result = input % (int) Math.pow(10, exponent);
            if (result >= ( (int) Math.pow(10, exponent) / 2)) {
                input += ((int) Math.pow(10, exponent)) - (result);
                exponent += 1;
            } else {
                input -= result;
                exponent += 1;
            }
        }

        System.out.println(input);


    }


}