import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/2754 */


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Float> hashMap = new HashMap<>();

        hashMap.put("A+", 4.3F);
        hashMap.put("A0", 4.0F);
        hashMap.put("A-", 3.7F);
        hashMap.put("B+", 3.3F);
        hashMap.put("B0", 3.0F);
        hashMap.put("B-", 2.7F);
        hashMap.put("C+", 2.3F);
        hashMap.put("C0", 2.0F);
        hashMap.put("C-", 1.7F);
        hashMap.put("D+", 1.3F);
        hashMap.put("D0", 1.0F);
        hashMap.put("D-", 0.7F);
        hashMap.put("F", 0.0F);

        String score = bf.readLine();

        System.out.println(hashMap.get(score));
    }



}