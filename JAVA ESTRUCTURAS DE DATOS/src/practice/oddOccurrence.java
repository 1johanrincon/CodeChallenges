package practice;

import java.util.HashMap;

public class oddOccurrence {

    public static void main(String[] args) {
        int[] arr = {8,4,6,3,4,5,6,4,3,5,2,4,4,2};
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i], 1);
            }
        }
        hashMap.entrySet().stream().sorted((x,y) -> x.getKey() - y.getKey()).forEach(System.out::println);
    }
}
