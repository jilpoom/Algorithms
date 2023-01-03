import java.io.*;
import java.util.*;
public class Main{
    /**
     * 2023-01-03
     * @author JY
     *
     * */

    static int answer = 0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine();
        String[] str = example.split("-");
        for(int i = 0; i < str.length; i++){
            int temp = mySum(str[i]);

            if(i == 0){
                answer += temp;
            } else {
                answer -= temp;
            }

        }
        System.out.println(answer);



    }

    private static int mySum(String s) {
        int sum = 0;
        String temp[] = s.split("[+]");
        for(int i = 0; i < temp.length; i++){
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }

    static void greed(String line){
        int plus = 0;
        int minus = 0;

        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == '+'){
                plus++;
            } else if (line.charAt(i) == '-'){
                minus++;
            }
        }



    }

}