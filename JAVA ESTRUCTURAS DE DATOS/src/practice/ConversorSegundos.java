package practice;

public class ConversorSegundos {
    public static void main(String[] args) {
        System.out.println(solution(1123200));
    }

    public static String solution(int X) {
        // write your code in Java SE 8
        if(X <= 60){
            return X+"s";
        }

        if(X <= 3600){
            int minutos = X / 60;
            int segundos = X %= 60;
            return minutos +"m"+segundos+"s";
        }

        if(X < 86400){
            int horas = X / 3600;
            X %= 3600;
            int minutos = X / 60;
            int segundos = X %= 60;
            minutos = minutos +1;
            return horas +"h "+minutos+ "m";
        }
        if(X == 86400){
            int horas = X / 3600;
            X %= 3600;
            int minutos = X / 60;
            int segundos = X %= 60;
            minutos = minutos;
            return horas +"h "+minutos+ "m";
        }

        if(X <= 604800 ){
            int dias = X/86400;
            X %= 86400;
            int horas = X / 3600;
            X %= 3600;
            return dias+"d"+horas+"h";
        }
        int week = X / 604800;
        X %= 604800;
        int dias = X/86400;
        return week+"w"+dias+"d";
    }
}
