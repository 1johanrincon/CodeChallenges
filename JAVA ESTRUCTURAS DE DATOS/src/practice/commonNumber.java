package practice;

import java.util.HashSet;

public class commonNumber {

    public static void main(String[] args) {
        int[] array1 = {8,9,0,1,0,3};
        int[] array2 = {9,4,0,0};
        int max = 0;
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]){
                    hash.add(array1[i]);
                }
            }
        }
        hash.stream().sorted((x,y) -> y > x ? 1 :- 1).map(x -> x *4 + 50 -1).forEach(System.out::println);
    }
}
