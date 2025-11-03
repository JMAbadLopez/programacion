package entregable;

import java.util.Scanner;

public class TresEnRaya {

    private static final int N = 3;

    public static void main(String[] args) {

        char[][] tablero = new char[N][N];
        char turnoActual = 'X';
        int fila, columna, numeroJugada = 0;
        boolean jugadaCorrecta = true;
        Scanner sc = new Scanner(System.in);

        inicializarTablero(tablero);
        imprimirTablero(tablero);
        System.out.println("Empieza el jugador 'X'\n");

        do {

            do {
                System.out.println("Turno del jugador [" + turnoActual +"]");
                System.out.println("- Dame una fila (0-2): ");
                fila = sc.nextInt();
                sc.nextLine();

                System.out.println("- Dame una columna(0-2): ");
                columna = sc.nextInt();
                sc.nextLine();

                jugadaCorrecta = jugarTurno(tablero, fila, columna, turnoActual);

                if (!jugadaCorrecta) {
                    System.out.println("La posición está ocupada");
                }

            } while (!jugadaCorrecta);

            imprimirTablero(tablero);
            turnoActual = intercambiaTurno(turnoActual);
            numeroJugada++;

        } while(!comprobarTablero(tablero, numeroJugada));

        if (comprobarTablero(tablero, numeroJugada) && numeroJugada < N*N) {
            turnoActual = intercambiaTurno(turnoActual);
            System.out.println("¡Ha ganado el jugador " +  turnoActual + "!");
        } else {
            System.out.println("Fin del juego");
        }

    }

    public static boolean comprobarTablero(char[][] tablero, int numeroJugada) {

        if ( tablero[0][0] == tablero[0][1] && tablero[0][1] == tablero[0][2] && tablero[0][0] != '-') {
            return true;
        }
        if ( tablero[0][0] == tablero[1][0] && tablero[1][0] == tablero[2][0] && tablero[0][0] != '-') {
            return true;
        }
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != '-') {
            return true;
        }
        if (tablero[0][1] == tablero[1][1] && tablero[1][1] == tablero[2][1] && tablero[0][1] != '-') {
            return true;
        }
        if (tablero[0][2] == tablero[1][2] && tablero[1][2] == tablero[2][2] && tablero[0][2] != '-') {
            return true;
        }
        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != '-') {
            return true;
        }
        if (tablero[1][0] == tablero[1][1] && tablero[1][1] == tablero[1][2] && tablero[1][0] != '-') {
            return true;
        }
        if (tablero[2][0] == tablero[2][1] && tablero[2][1] == tablero[2][2] && tablero[2][0] != '-') {
            return true;
        }
        if (numeroJugada == N*N) {
            return true;
        }
        return false;
    }

    public static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++ ) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    public static void imprimirTablero(char[][] tablero) {
        System.out.println("TABLERO");
        System.out.println("---------------------");
        System.out.println("\t0\t\t1\t\t2");
        for (int i = 0; i < tablero.length; i++ ) {
            System.out.print( i + "\t");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + "\t");
                if(j == 0 || j == 1) {
                    System.out.print("|\t");
                }
            }
            System.out.println();
        }
    }

    public static boolean jugarTurno(char[][] tablero, int fila, int columna, char jugador) {
        if(tablero[fila][columna] == '-') {
            tablero[fila][columna] = jugador;
            return true;
        } return false;
    }

    public static char intercambiaTurno(char turno) {
        if(turno == 'X') {
            return 'O';
        } return 'X';
    }
}