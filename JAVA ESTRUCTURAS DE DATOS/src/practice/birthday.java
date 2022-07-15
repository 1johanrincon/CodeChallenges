package practice;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.List;

public class birthday {

    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        for (int i = 0; i <= s.size()-m; i++) {
            int suma = 0;
            int mes = 0;
            while(mes < m){
                suma = suma + s.get(i+mes);
                mes++;
            }
            if(suma == d){
                count = count +1;
            }
        }
        return count;
    }
}
