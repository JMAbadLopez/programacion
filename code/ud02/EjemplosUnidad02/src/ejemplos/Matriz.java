package ejemplos;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        /** Declaración de FILAS y COLUMNAS */
        final int FIL = 3;
        final int COL = 3;
        /** Declaración de la Matriz */
        int[][] matriz = new int[FIL][COL];
        /* Otras variables */
        Scanner sc = new Scanner(System.in);
        /** Solicitamos valores */
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dame un valor entero para la posición ["+i+"]["+j+"]:");
                matriz[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        /** Recorremos la matriz */
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]\t");
            }
            // System.out.println();
        }
    }
}
