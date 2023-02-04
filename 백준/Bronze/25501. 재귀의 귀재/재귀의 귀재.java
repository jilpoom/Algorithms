import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    /**
     * Recursion
     * 2023-02-04
     *
     * @author JY
     * https://www.acmicpc.net/problem/25501
     */

    static int result  = 0;
    public static int recursion(String s, int l, int r) {
        result++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());

        for(int i = 0; i < N; i++){
            result = 0;
            sb.append(isPalindrome(bf.readLine())).append(" ").append(result).append("\n");
        }

        System.out.println(sb);
    }


}