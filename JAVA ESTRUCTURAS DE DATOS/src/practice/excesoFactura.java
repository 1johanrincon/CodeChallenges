package practice;

import java.util.Arrays;

public class excesoFactura {

    public static void main(String[] args) {
        int i1= 5;
        int I2 = 2;
        int i3 = 5/2;
        System.out.println(i3);
    }
    public static String[] solution(String S, String[] B) {
        // write your code in Java SE 8
        Double total = 0.00;
        for (int i = 0; i < B.length; i++) {
            total = total + Double.parseDouble(B[i]);
        }

        return B;
    }
}
