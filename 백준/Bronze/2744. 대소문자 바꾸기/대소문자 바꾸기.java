import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/2744 */


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        String result = "";

        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z'){
                result += (char) (line.charAt(i) + 32);
            } else if(line.charAt(i) >= 'a' && line.charAt(i) <= 'z'){
                result += (char) (line.charAt(i) - 32);
            }

        }
        System.out.println(result);
    }



}