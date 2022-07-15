package practice;

public class printPrimeNumbers {
    public static void main(String[] args) {
        prime();
    }

    public static void prime(){
        int[] numbers = {34,5,6,7,8,9,2,3,1,5,11};
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0 && numbers[i] != 1){
                System.out.println(numbers[i]);
            }
        }
    }
}
