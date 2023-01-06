import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-06
     * @author JY
     * https://www.acmicpc.net/problem/1435
     */


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int num = 666;
        int count = 1;

        while(count != N) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);


    }


}
