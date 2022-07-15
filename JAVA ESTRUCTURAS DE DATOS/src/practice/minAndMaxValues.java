package practice;

public class minAndMaxValues {

    public static void main(String[] args) {
        minMax();
    }

    public static void minMax(){
        int[] array = {454,56,6,89,2,45,1,564,1000,-5};
        int min= array[0];
        int max= array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }

}
