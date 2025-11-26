package algoritmica;

public class Burbuja {

    public static void main(String[] args) {
        int[] numeros = {5,3,8,4,2,8};
        mostrar(numeros);

        burbuja(numeros);
        mostrar(numeros);

    }

    public static void burbuja(int[] numeros) {
        int aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j+1]) {
                    System.out.println("- Intercambio " + numeros[j] + " por " + numeros[j+1]);
                    aux = numeros[j];
                    numeros[j]  = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }

        }
    }

    public static void mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]");
        }
        System.out.println();
    }
}
