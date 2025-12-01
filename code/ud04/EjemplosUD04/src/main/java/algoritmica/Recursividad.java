package algoritmica;

public class Recursividad {

    public static void main(String[] args) {

        int sumatorio, factorial, fibonacci;
        String palabra = "abracadabra";

        System.out.println("El sumatorio de 5 es " + sumatorio(5));
        System.out.println("El factorial de 5 es " + factorial(5));
        System.out.println("El fibonacci de 5 es " + fibonacci(5));

        System.out.println( palabra + " tiene " + contarLetras(palabra,0) + " letras");

    }

    public static int sumatorio(int n){
        if(n==1){
            return 1;
        }
        return n + sumatorio(n-1);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int fibonacci(int n){
        if(n==1 || n==0) {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int contarLetras(String palabra, int posicion) {

        if(palabra.length() == posicion) {
            return 0;
        }
        return 1 + contarLetras(palabra, posicion + 1);
    }
}
