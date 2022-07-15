package practice;

import java.util.Arrays;
import java.util.List;

public class breakingRecords {

    public static void main(String[] args) {
        System.out.println(breakingRecords(Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int max = scores.get(0);
        int min = scores.get(0);
        int countMax = 0;
        int countMin = 0;
        for (int i = 0; i < scores.size(); i++) {
            if(scores.get(i) > max){
                max = scores.get(i);
                countMax = countMax +1;
            }else if(scores.get(i) < min){
                min = scores.get(i);
                countMin = countMin +1;
            }
        }

        return Arrays.asList(countMax, countMin);
    }

}
