package practice;

import java.util.HashMap;

public class frecuenciEachLetter {

    public static void main(String[] args) {
        frecuenci("ahfdshfglahdgaldfglsdfñashdgfjsdgñafhgñjf´´afgñsdvhafg");
    }

    public static void frecuenci(String word){
        char[] arr = word.toCharArray();
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(result.containsKey(arr[i])){
                result.put(arr[i], result.get(arr[i])+1);
            }else{
                result.put(arr[i], 1);
            }
        }
        System.out.println(result);
    }
}
