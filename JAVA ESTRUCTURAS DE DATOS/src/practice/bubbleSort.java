package practice;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        bubbleSortA();
    }

    public static void bubbleSortA(){
        int[] array ={34,6,78,9,21,45};
        boolean sort = true;
        while(sort){
            sort = false;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    sort = true;
                    int temp = array[i];
                    array[i]= array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        Arrays.stream(array).map(x -> x +1).forEach(System.out::println);
    }
}
