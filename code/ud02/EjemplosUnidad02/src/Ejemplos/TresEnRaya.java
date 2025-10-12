package ejemplos;

public class TresEnRaya {
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];

        // 1. Inicializar el tablero con '-'
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                tablero[fila][col] = '-';
            }
        }

        // 2. Mostrar el tablero (Inicial)
        System.out.println("--- TABLERO DE JUEGO ---");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(tablero[fila][col] + " | ");
            }
            System.out.println(); // Salto de línea para la siguiente fila
        }

        // 3. Simular movimientos
        tablero[0][1] = 'X';
        tablero[1][1] = 'O';
        tablero[2][0] = 'X';

        // 4. Mostrar el tablero
        System.out.println("--- TABLERO DE JUEGO ---");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(tablero[fila][col] + " | ");
            }
            System.out.println(); // Salto de línea para la siguiente fila
        }
    }
}