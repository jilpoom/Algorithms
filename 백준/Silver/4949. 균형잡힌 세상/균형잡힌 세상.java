import java.io.*;
import java.util.*;
public class Main{
    /**
     * 2023-01-04
     * @author JY
     * site :  https://www.acmicpc.net/problem/4949
     * */



        public static void main(String args[]) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));



            while(true){
                String line = bf.readLine();
                if(line.equals(".")){
                    break;
                }
                char[] lineArray = line.toCharArray();
                boolean isValid = true;
                Stack<Character> myStack = new Stack<>();

                for(char c : lineArray){
                    if(c == '(' || c == '['){
                        myStack.push(c);
                    }
                    else if(c == ')'){
                        if(myStack.isEmpty() || myStack.peek() != '('){
                            isValid = false;
                            break;
                        }
                        myStack.pop();
                    }
                    else if(c == ']'){
                        if(myStack.isEmpty() || myStack.peek() != '['){
                            isValid = false;
                            break;
                        }
                        myStack.pop();
                    }
                }
                if(!myStack.isEmpty()) isValid = false;
                if(isValid) System.out.println("yes");
                else System.out.println("no");
            }



        }






}