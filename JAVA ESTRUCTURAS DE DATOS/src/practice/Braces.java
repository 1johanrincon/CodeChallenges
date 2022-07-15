package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Braces {

    public static void main(String[] args) {
        List<String> braces = new ArrayList<>();
        braces.add("[]{()}()");
        braces.add("([{}])");
        System.out.println(matchingBraces(braces));
    }

    public static List<String> matchingBraces(List<String> braces) {
        // Write your code here
        List<String> result = new ArrayList();
        for (int i = 0; i < braces.size(); i++) {
            String str = braces.get(i);
            result.add(bracesHelper(str));
        }
        return result;
    }

    public static String bracesHelper(String str){
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack();
        if(arr.length == 0){
            return "NO";
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '{' || arr[i] == '(' || arr[i] == '['){
                stack.push(arr[i]);
                continue;
            }else{
                if(stack.empty()){
                    return "NO";
                }else{
                    char actual = stack.peek();
                    if(arr[i] == '}' && actual != '{'){
                        return "NO";
                    }
                    if(arr[i] == ']' && actual != '['){
                        return "NO";
                    }
                    if(arr[i] == ')' && actual != '('){
                        return "NO";
                    }
                }
            }
            stack.pop();
        }
        return stack.empty() ? "YES" : "NO";
    }
}
