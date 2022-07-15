package practice;

import java.util.Stack;

public class stringReverse {

    public static void main(String[] args) {
        String str = "Java Programing";
        reverseEachWords(str);
    }

    public static void reverseStack(){
        String str = "Java Programing";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while(!stack.empty()){
            System.out.print(stack.pop());
        }
    }

    public static String recursion(String str, int length){
        if(length == 0){
            return str.charAt(length)+"";
        }
        return str.charAt(length) + (recursion(str, length-1));
    }

    public static void reverseEachWords(String str){
        char[] array = str.toCharArray();
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i]);
        }
    }

}
