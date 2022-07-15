package practice;

public class maxNumber {

    public static void main(String[] args) {
        System.out.println(therdMaxNumber());
    }

    public static int firstMaxNumber(){
        int[] arr = {490,6,18,100,56,97,47,37};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        };
        return max;
    }

    public static int secondMaxNumber(){
        int[] arr = {4,6,8,0,5,9,7,3,100};
        int max = arr[0];
        int secondmax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }else if(arr[i] > secondmax){
                secondmax = arr[i];
            }
        };
        return secondmax;
    }

    public static int therdMaxNumber(){
        int[] arr = {100, 105, 103};
        int max = arr[0];
        int secondMax = arr[0];
        int therdMax =  arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                therdMax = secondMax;
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] < max){
                therdMax = secondMax;
                secondMax = arr[i];
            }else if(arr[i] > therdMax && arr[i] < secondMax){
                therdMax = arr[i];
            }
        };
        return therdMax;
    }
}
