package entregable;

import java.util.Scanner;

public class Equipos {

    public static void main(String[] args) {

        final int EQUIPOS = 2;
        final int JUGADORES = 5;

        Scanner teclado = new Scanner(System.in);

        String[][] jugadores = {
                {"Jordan","Pippen","A","B","C","D"},
                {"E","F","G","H","I","J"}
        };

        int[][] triples = new int[EQUIPOS][JUGADORES];
        int[][] dobles = new int[EQUIPOS][JUGADORES];
        int[][] libres = new int[EQUIPOS][JUGADORES];

        rellenarDatos(teclado, triples, dobles, libres);

    }

    public static void rellenarDatos(Scanner teclado, int[][] triples, int[][] dobles, int[][] libres) {
        System.out.println("");
    }

    public static int buscarJugador(String [][] jugadores, String nombreJugador) {

    }

    public static void mostrarJugador(int posicionEquipo, int posicionJugador) {

    }


}
