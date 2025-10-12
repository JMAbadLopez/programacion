package ejemplos;
import java.util.Scanner;

public class GestionMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántas filas tendrá la matriz? ");
        int filas = teclado.nextInt();
        System.out.print("¿Cuántas columnas tendrá la matriz? ");
        int columnas = teclado.nextInt();

        // Creamos la matriz con el tamaño que ha dicho el usuario
        int[][] matriz = new int[filas][columnas];

        // Bucle anidado para LEER y rellenar la matriz
        System.out.println("--- Introduce los valores de la matriz ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce el valor para la celda [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Bucle anidado para ESCRIBIR y mostrar la matriz
        System.out.println("\n--- La matriz resultante es ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t"); // Usamos \t para tabular y alinear
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }
    }
}