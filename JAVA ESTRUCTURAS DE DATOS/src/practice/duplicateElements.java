package practice;

import java.util.HashMap;
import java.util.HashSet;

public class duplicateElements {

    public static void main(String[] args) {
        duplicate();
    }

    public static void duplicate(){
        int[] numbers = {1,1,4,6,7,6,7,8,9,10,8,5,2,3,1};
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(result.containsKey(numbers[i])){
                result.put(numbers[i], result.get(numbers[i])+1);
            }else{
                result.put(numbers[i], 1);
            }
        }
        result.entrySet().stream().filter(number -> number.getValue() > 1).forEach(number -> System.out.println(number.getKey()));
    }
}
