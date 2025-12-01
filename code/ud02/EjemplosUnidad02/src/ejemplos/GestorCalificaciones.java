package ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class GestorCalificaciones {

    // ############### FUNCIÓN PRINCIPAL (main) ###############
    // Actúa como el director de orquesta. No hace los cálculos,
    // solo llama a las herramientas (funciones) adecuadas en orden.
    public static void main(String[] args) {

        mostrarBienvenida(); // Llamada a un procedimiento

        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[5];

        // Llamamos a una herramienta para rellenar el array.
        // Le pasamos la "dirección" del array (paso por referencia).
        rellenarNotas(teclado, notas);

        // Llamamos a herramientas que calculan y nos devuelven un resultado.
        double media = calcularMedia(notas);
        double notaMaxima = encontrarMaxima(notas);

        // Finalmente, llamamos a un procedimiento para mostrarlo todo.
        mostrarInforme(notas, media, notaMaxima);

    } // Fin del main


    // ############### HERRAMIENTAS (Funciones y Procedimientos) ###############

    /**
     * PROCEDIMIENTO: Muestra un mensaje de bienvenida.
     * No necesita datos (parámetros) y no devuelve nada (void).
     */
    public static void mostrarBienvenida() {
        System.out.println("--- Bienvenido al Gestor de Calificaciones ---");
        System.out.println("A continuación, deberás introducir 5 notas.");
        System.out.println("----------------------------------------------");
    }

    /**
     * PROCEDIMIENTO: Pide al usuario las notas y rellena el array.
     * Recibe el Scanner y el array de notas.
     * Como el array se pasa por REFERENCIA, los cambios hechos aquí
     * afectarán al array original del main.
     */
    public static void rellenarNotas(Scanner teclado, double[] arrayNotas) {
        for (int i = 0; i < arrayNotas.length; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            arrayNotas[i] = teclado.nextDouble();
        }
    }

    /**
     * FUNCIÓN: Calcula la media de las notas de un array.
     * Recibe un array de notas y DEVUELVE un double (la media).
     */
    public static double calcularMedia(double[] arrayNotas) {
        double sumaTotal = 0;
        for (int i = 0; i < arrayNotas.length; i++) {
            sumaTotal += arrayNotas[i]; // Acumulador
        }
        return sumaTotal / arrayNotas.length;
    }

    /**
     * FUNCIÓN: Encuentra la nota más alta en un array.
     * Recibe un array de notas y DEVUELVE un double (la nota máxima).
     */
    public static double encontrarMaxima(double[] arrayNotas) {
        double max = arrayNotas[0]; // Suponemos que la primera es la más alta
        for (int i = 1; i < arrayNotas.length; i++) {
            if (arrayNotas[i] > max) {
                max = arrayNotas[i]; // Encontramos una nueva máxima
            }
        }
        return max;
    }

    /**
     * PROCEDIMIENTO: Muestra el informe final de calificaciones.
     * Recibe el array de notas, la media y la máxima.
     * Los parámetros 'media' y 'maxima' se pasan por VALOR (fotocopias).
     */
    public static void mostrarInforme(double[] arrayNotas, double media, double maxima) {
        System.out.println("\n--- INFORME DE CALIFICACIONES ---");
        System.out.println("Notas introducidas: " + Arrays.toString(arrayNotas));
        System.out.printf("Nota Media: %.2f\n", media);
        System.out.println("Nota más Alta: " + maxima);
        System.out.println("---------------------------------");
    }
}