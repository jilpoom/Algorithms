import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-05
     *
     * @author JY
     * https://www.acmicpc.net/problem/1181
     * */



    static HashSet<String> hashSet = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        for(int i = 0; i < N; i++){
            String line = bf.readLine();
            hashSet.add(line);
        }

        Iterator<String> it = hashSet.iterator();

        String[] strArray = new String[hashSet.size()];

        for(int i = 0; i < hashSet.size(); i++){
            if(it.hasNext()) {
                strArray[i] = it.next();
            }
        }

        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }

                else {
                    return o1.length() - o2.length();
                }
            }
        });

        for(String line : strArray){
            System.out.println(line);
        }

    }




}