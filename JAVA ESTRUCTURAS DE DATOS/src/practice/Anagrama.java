package practice;


//hola aloh == true
//aeiou uiaeo == true

import java.util.HashMap;

public class Anagrama {

    public static void main(String[] args){

        String var1 = "EAaaaaOIU";
        String var2 = "EAaaaaOIU";

        HashMap map1 = new HashMap();
        HashMap map2 = new HashMap();

        char[] var11 = var1.toCharArray();
        char[] var22 = var2.toCharArray();

        for (char c : var11) {
            if(map1.containsKey(c)){
                var i = map1.get(c);
                Integer i2 = Integer.parseInt(i.toString());
                map1.put(c, ++i2);
            }else{
                map1.put(c, 1);
            }
        };

        for (char c : var22) {
            if(map2.containsKey(c)){
                var i = map2.get(c);
                Integer i2 = Integer.parseInt(i.toString());
                map2.put(c, ++i2);
            }else{
                map2.put(c, 1);
            }
        }
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map1.equals(map2));
    };
}
