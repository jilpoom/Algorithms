import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int index = sc.nextInt();

        System.out.println(divisorArrayList(dividend, index));
    }

    public static int divisorArrayList(int dividend, int index){
        ArrayList<Integer> divisorList = new ArrayList<>();

        for(int i = 1; i <= Math.sqrt(dividend); i++){
            if(dividend % i == 0) {
                divisorList.add(i);
                if(i != dividend / i) divisorList.add(dividend / i);
            }
        }
        divisorList.sort(Comparator.naturalOrder());

        return index <= divisorList.size() ? divisorList.get(index - 1) : 0;
    }


}