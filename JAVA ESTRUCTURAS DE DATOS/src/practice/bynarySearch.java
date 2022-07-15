package practice;

public class bynarySearch {

    public static void main(String[] args) {
        int[] arr = {10,11,12,13,14,15,16,17,18,19,20};
        int start = 0;
        int end = arr.length;
        int search = 12;
        System.out.println(recursion(arr, start, end, search));
    }

    public static int recursion(int[] arr, int start, int end, int search){
        if(start > end){
            return 0;
        }
        int mid = (start + end) / 2;

        if(search == arr[mid]){
            return mid;
        }
        if(search > arr[mid]){
            return recursion(arr, mid+1, end, search);
        }else{
            return recursion(arr, start, mid-1, search);
        }
    }
}
