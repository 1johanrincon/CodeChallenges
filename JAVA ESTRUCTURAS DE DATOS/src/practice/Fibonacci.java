package practice;

public class Fibonacci {

     private static long[] cache;

    public static void main(String[] args) {
        int n = 3;
        cache = new long[n+1];
        System.out.println(memoizacionFibonacci(n));
    }

    public static long fibonacci(long number){
        if(number <= 1 ){
            return number;
        };
        return (fibonacci(number-1) + fibonacci(number-2));
    }

    public static long memoizacionFibonacci(int n){
        if(n <= 1){
            return n;
        }
        //validamos que exista el numero en nuestro cache si existe es diferente de 0 x q es un numero primitivo y no es null, lo devolvemos;
        if(cache[n] != 0){
            return cache[n];
        }
        //guardamos en la posicion n el resultado de la suma de (n-2) (n-1);
        cache[n] = (fibonacci(n-2) + fibonacci(n-1));
        return cache[n];
    }
}
