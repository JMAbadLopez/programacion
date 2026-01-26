public class Conecta4 {

    private final int COL = 7;
    private final int FIL = 6;

    private char[][] tablero = new char[FIL][COL];

    public Conecta4() {
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                this.tablero[i][j] = '.';
            }
        }
    }

    public boolean estaDisponible(int fila, int columna) {
        return this.tablero[fila][columna] == '.';
    }

    public void setFicha(int fila, int columna, char ficha) {
        this.tablero[fila][columna] = ficha;
    }

    public boolean esO(int fila, int columna) {
        return this.tablero[fila][columna] == 'O';
    }

    public boolean esX(int fila, int columna) {
        return this.tablero[fila][columna] == 'X';
    }

    public void mostrarTablero() {
        System.out.println(" 0 1 2 3 4 5 6");
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.printf("%2c", this.tablero[i][j]);
            }
            System.out.println("");
        }
    }

}