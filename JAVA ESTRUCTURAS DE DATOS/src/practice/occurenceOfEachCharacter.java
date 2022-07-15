package practice;

import java.util.HashMap;
import java.util.Locale;

public class occurenceOfEachCharacter{
    public static void main(String[] args) {
        String word = "Javzaaaasaasdsfdsdfdfgfdghgfhghgfjghhuhdfgdfgdfgjfghjfghfghfghfghfghfghfgdgsdfsdffgfdga";
        HashMap<Character, Integer> occurrence = new HashMap<>();
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(occurrence.containsKey(arr[i])){
                occurrence.put(arr[i], occurrence.get(arr[i])+1);
            }else{
                occurrence.put(arr[i], 1);
            }
        };
        occurrence.entrySet().stream().sorted((x,y)-> y.getValue() - x.getValue()).forEach(System.out::println);
    }
}
