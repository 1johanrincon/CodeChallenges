package practice;

import static java.lang.Math.max;

public class canJump {

    public static void main(String[] args) {
        int[] array = {1,3,2,0,2};
        int[] array2 = {1,1,2,5,2,1,0,0,1,3};
        System.out.println(jump(array2));
    }

    public static boolean jump(int[] array){
        int len = array.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            if(max < i){
                return false;
            }
            max = max > i + array[i] ? max : i + array[i];
        }
        return true;
    }
}
