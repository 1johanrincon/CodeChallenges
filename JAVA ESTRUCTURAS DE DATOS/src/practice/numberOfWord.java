package practice;

public class numberOfWord {
    public static void main(String[] args) {
        words("Hola cuantas palabras tengo    gfkgf ");
    }

    public static void words(String palabra){
        String[] palabras = palabra.split(" ");
        System.out.println(palabras.length);
    }
}
