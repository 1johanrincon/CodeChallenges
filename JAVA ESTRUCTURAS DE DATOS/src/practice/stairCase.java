package practice;

public class stairCase {

    public static void main(String[] args) {
        staircase(5);
    }

    public static void staircase(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            int space = i;
            int numeral = i;
            while (space < n) {
                System.out.print(' ');
                space++;
            }

            while(numeral > 0){
                System.out.print("#");
                numeral--;
            }
            System.out.println();
        }
    }
}
