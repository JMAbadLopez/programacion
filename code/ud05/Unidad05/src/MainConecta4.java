import java.util.Scanner;

public class MainConecta4 {

    public static void main(String[] args) {

        final int COL = 7;
        final int FIL = 6;

        Conecta4 conecta = new Conecta4();
        Scanner sc = new Scanner(System.in);
        char ficha = 'X';
        int jugador = 1, columnaJugada = 0, filaABuscar = FIL - 1;
        boolean continuar = true;

        conecta.mostrarTablero();

        while (continuar) {

            do {
                System.out.printf("Jugador %d (%c), elige columna (0-6): ", jugador, ficha);

                columnaJugada = sc.nextInt();
                sc.nextLine();
                if (columnaJugada < 0 || columnaJugada >= COL) {
                    System.out.println("[ERROR] Columna fuera de límites (0-6).");
                }

            } while (columnaJugada < 0 || columnaJugada >= COL);

            while (filaABuscar >= 0 && !conecta.estaDisponible(filaABuscar, columnaJugada)) {
                filaABuscar--;
            }

            if (filaABuscar < 0) {
                System.out.println("[ERROR] Columna llena. Escoge otra.");
            } else {
                conecta.setFicha(filaABuscar, columnaJugada, ficha);
                conecta.mostrarTablero();

                jugador = (jugador == 1) ? 2 : 1;
                ficha = (ficha == 'X') ? 'O' : 'X';
            }
            filaABuscar = FIL - 1;
        }
    }
}