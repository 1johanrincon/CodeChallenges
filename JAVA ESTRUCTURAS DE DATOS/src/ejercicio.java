/*give me the repeated numbers from the given array
in = {1, 3, 12, 1, 2, 2, 7, 10}
out = {1, 2}*/


import java.util.HashMap;

public class ejercicio {

    public static void main(String[] args) {
       int[] in = {1, 3, 12, 1, 2, 2,2, 7, 10};
       method1(in);
    }

    public static void method1(int[] arr){
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int number : arr) {
            if(result.containsKey(number)){
                result.put(number, result.get(number)+1);
            }else{
                result.put(number, 1);
            }
        }
        result.entrySet().stream().filter(x -> x.getValue() > 1).forEach(System.out::println);
    }
}
