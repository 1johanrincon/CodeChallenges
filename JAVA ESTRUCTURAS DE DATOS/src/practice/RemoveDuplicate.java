package practice;

import java.util.HashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {
        loop();
    }

    public static void loop(){
        int[] numbers = {0,0,1,2,2,3,4,5,5,5,6,7,7,7,7,8,9};
        Integer[] response = new Integer[numbers.length];
        int index = 1;
        response[0] = numbers[0];
        int current = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(current != numbers[i]){
                response[index] = numbers[i];
                current = numbers[i];
                index++;
            }
        }

        for (int i = 0; i < response.length; i++) {
            if(response[i] != null) {
                System.out.println(response[i]);
            }
        }
    }

    public static void hashMethod(){
        int[] numbers = {1,2,2,3,4,5,5,5,6,7,7,7,7,8,9};
        HashSet<Integer> hash = new HashSet<>();
        for(int n : numbers){
            hash.add(n);
        }
        hash.stream().forEach(System.out::println);
    }
}
