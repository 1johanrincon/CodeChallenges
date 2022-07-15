package practice;

public class Palindromo {

    public static void main(String[] args) {
        String palindromo = "oso";
        System.out.println(result(palindromo));
    };

    public static String result(String str){
        str =  str.replace(" ","");
        char[] arr = str.toCharArray();
        int l = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[l]){
                return "NO ES UN PALINDROMO";
            }
            l--;
        }
        return "ES UN PALINDROMO";
    }
}
