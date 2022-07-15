package practice;

public class minNumber {

    public static void main(String[] args) {
        System.out.println(firstMinNumber());
    }

    public static int firstMinNumber(){
        int[] arr = {490,6,18,100,56,97,47,37};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        };
        return min;
    }

    public static int secondMinNumber(){
        int[] arr = {4,6,8,0,5,9,7,3};
        int min = arr[0];
        int secondMin = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            }else if(arr[i] < secondMin){
                secondMin = arr[i];
            }
        };
        return secondMin;
    }

    public static int therdMinNumber(){
        int[] arr = {400,6,80,10,5,90,7,5553,4,2,0};
        int min = arr[0];
        int secondMin = arr[0];
        int therdMin =  arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                therdMin = secondMin;
                secondMin = min;
                min = arr[i];
            }else if(arr[i] < secondMin && arr[i] > min){
                therdMin = secondMin;
                secondMin = arr[i];
            }else if(arr[i] < therdMin && arr[i] > secondMin){
                therdMin = arr[i];
            }
        };
        return therdMin;
    }
}
