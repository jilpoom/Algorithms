import java.util.Scanner;

public class Main {

    static long[] waveSequenceArray = new long[101];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for(int i = 0; i < testCase; i++){
            int input = sc.nextInt();

            System.out.println(waveSequence(input));
        }



    }


    public static long waveSequence(int i){
       waveSequenceArray[0] = 1L;
       waveSequenceArray[1] = 1L;
       waveSequenceArray[2] = 1L;

       if(i <= 3 || waveSequenceArray[i - 1] != 0){
           return waveSequenceArray[i - 1];
        } else {
           waveSequenceArray[i - 1] = waveSequence(i - 2) + waveSequence(i - 3);
           return waveSequenceArray[i - 1];
       }

    }




}
