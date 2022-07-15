package practice;

import java.util.HashMap;
import java.util.HashSet;

public class findSumTarget {

    public static void main(String[] args) {
        target();
    }

    public static void target(){
        int[] n = {3,5,6,7,2,445};
        int target = 9;
        HashSet<Integer> par = new HashSet<>();

        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if(n[i]+n[j] == target){
                    par.add(n[i]);
                    par.add(n[j]);
                }
            }
        }
        System.out.println(par);
    }
}
