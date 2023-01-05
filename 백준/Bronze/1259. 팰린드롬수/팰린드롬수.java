import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/1259
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        while(true){
            String line = bf.readLine();
            boolean isValid = true;

            if(line.equals("0")){
                break;
            }
            
            int end = line.length() - 1;

            for(int i = 0; i < line.length() / 2; i++){
                if(line.charAt(i) != line.charAt(end)){
                    isValid = false;
                    System.out.println("no");
                    break;
                }
                end--;
            }

            if(isValid){
                System.out.println("yes");
            }


        }


    }




}