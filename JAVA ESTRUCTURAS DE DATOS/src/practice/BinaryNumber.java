package practice;

import java.util.Arrays;

public class BinaryNumber {

    public static void main(String[] args) {
        solution(805306373);
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        Integer n = N;
        String number = Integer.toBinaryString(n);
        System.out.println(number);
        int solution = 0;
        char uno = '1';
        char cero = '0';
        boolean flag = false;
        char[] arr = number.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == uno && flag == false && arr[i+1] == cero){
                flag = true;
            }else if(arr[i] == uno && flag == true){
                solution = counter > solution ? counter : solution;
                counter = 0;
            }else{
                counter++;
            }

        }
        System.out.println(solution);
        return solution;
    }

}
