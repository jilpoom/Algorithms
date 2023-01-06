import java.io.*;
import java.util.*;

public class Main {
    /**
     * 2023-01-06
     *
     * @author JY
     * https://www.acmicpc.net/problem/10814
     */

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());


        Person[] personArr = new Person[N];

        for(int i = 0; i < personArr.length; i++){
            st = new StringTokenizer(bf.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            personArr[i] = new Person(age, name);
        }

        Arrays.sort(personArr);

        for(Person a : personArr){
            System.out.println(a.toString());
        }


    }

    public static class Person implements Comparable<Person>{
        int age;
        String name;

        Person(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Person o) {
            if(this.age == o.age){
                return 0;
            }
            return this.age - o.age;
        }

        @Override
        public String toString() {
            return this.age + " " + this.name;
        }
    }


}
