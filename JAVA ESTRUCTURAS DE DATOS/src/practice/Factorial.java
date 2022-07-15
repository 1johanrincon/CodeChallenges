package practice;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(4));
    }

    public static long factorial(long number){

        //Validamos number mayor a 0 para devolver 1 si no hacemos recursividad de number-1
        if(number == 0){
            return 1;
        }else{
            return number * factorial(number-1);
        }
    };
}
