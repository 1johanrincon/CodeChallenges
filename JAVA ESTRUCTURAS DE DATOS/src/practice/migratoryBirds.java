package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class migratoryBirds {

    public static void main(String[] args) {
        //System.out.println(migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
        System.out.println(migratoryBirds(Arrays.asList(1, 5, 5, 5, 4, 4, 4, 3)));
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        HashMap<Integer, Integer> aves = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            if(aves.containsKey(arr.get(i))){
                aves.put(arr.get(i), aves.get(arr.get(i)) +1);
            }else{
                aves.put(arr.get(i),1);
            }
        }
        aves.entrySet().stream().sorted((x,y)-> x.getValue() - y.getValue()).sorted((x,y)-> x.getKey() - y.getKey()).forEach(System.out::println);
        return aves.entrySet().stream().max((x,y)-> x.getValue() - y.getValue()).get().getKey();
    }
}
