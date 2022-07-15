package practice;

import java.util.HashMap;

public class findFirstAndLastPosicion {

    public static void main(String[] args) {
        findPosicion(11);
    }

    public static void findPosicionHash(int n){
        int[] array = {1,4,5,6,8,9,9,11,11,11,11,11,15,16,18};
        HashMap<String, Integer> list = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if(array[i] == n && list.containsKey("posicionFinal")){
                list.put("posicionFinal", list.get("posicionFinal")+1);
            }else if(array[i] == n && !list.containsValue(n)){
                list.put("posicionInicial", i);
                list.put("posicionFinal", i);
            }
        }
        System.out.println(list);
    }

    public static void findPosicion(int n){
        int[] array = {1,4,5,6,8,9,9,11,11,11,11,11,15,16,18};
        int pInicial = -1;
        int pFinal = -1;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == n && pInicial == -1){
                pInicial = i;
            }

            if(array[i] == n && pInicial != -1){
                pFinal = i;
            }
        }
        System.out.println(pInicial);
        System.out.println(pFinal);
    }
}
