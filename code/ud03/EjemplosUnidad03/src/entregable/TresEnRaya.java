package entregable;

public class TresEnRaya {

    public static void main(String[] args) {

        final int N = 3, NJ = 2;
        char[][] tablero = new char[N][N];
        char[] jugadores = {'X','O'};

        inicializarTablero(tablero);
        imprimirTablero(tablero);

        if(jugarTurno(tablero,0,0 , jugadores[0])) {
            imprimirTablero(tablero);
        }

    }

    public static boolean comprobarTablero(char[][] tablero) {
        if ( tablero[0][0] == tablero[0][1] && tablero[0][1] == tablero[0][2] ) {
            return true;
        }
        if ( tablero[0][0] == tablero[1][0] && tablero[1][0] == tablero[2][0] ) {
            return true;
        }
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            return true;
        }
        if (tablero[0][1] == tablero[1][1] && tablero[1][1] == tablero[1][2]) {
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
        System.out.println("--- TABLERO ---");
        for (int i = 0; i < tablero.length; i++ ) {
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
}
