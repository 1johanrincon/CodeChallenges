package practice;
//0342
//0253

public class KangarooJump {

    public static void main(String[] args) {
        System.out.println(kangaroo(0,2,5,3));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if(x2 > x1 && v2 > v1){
            return "NO";
        }
        if(x2 != x1 && v2 == v1){
            return "NO";
        }else{
            if((x2 -x1)%(v1-v2)==0){
                return "YES";
            }else{
                return "NO";
            }
        }
    }
}
