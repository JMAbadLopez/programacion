package ejemplos;

import java.util.Scanner;

public class EjemploArrayParalelos {

    public static void main(String[] args) {

        final int N = 3;

        String[] nombres = new String[N];
        int[] edades = new int[N];
        Scanner teclado = new Scanner(System.in);

        // Llenamos los vectores paralelos
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = teclado.nextLine(); // Usamos nextLine para nombres completos

            System.out.print("Introduce la edad de " + nombres[i] + ": ");
            edades[i] = teclado.nextInt();
            teclado.nextLine(); // ¡Consumimos el salto de línea fantasma!
        }

        System.out.println("--- Personas mayores de edad ---");
        // Recorremos y mostramos
        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + "\t Edad: " + edades[i]);
            }
        }
    }
}
