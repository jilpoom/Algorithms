import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int fireworkAllTime = sc.nextInt();
        boolean[] isfireworkArray = new boolean[fireworkAllTime];
        int[] fireworkArray = new int[testCase];
        int count = 0;

        for(int i = 0; i < fireworkArray.length; i++){
            fireworkArray[i] = sc.nextInt();
        }

        for(int i = 0; i < fireworkArray.length; i++){
            for(int j = 0; j < isfireworkArray.length; j++) {
                if((j + 1) % fireworkArray[i] == 0) {
                    isfireworkArray[j] = true;
                }
            }
        }

        for(int i = 0; i < isfireworkArray.length; i++){
            if(isfireworkArray[i] == true){
                count += 1;
            }
        }

        System.out.println(count);

    }

}