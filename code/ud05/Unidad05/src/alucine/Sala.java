package alucine;

public class Sala {

    private char[][] asientos;
    private int numSala;
    private String pelicula;
    private String horaProyeccion;
    private double recaudacionSala;

    private static double recaudacionTotal = 0.0;

    private final double PRECIO_ENTRADA = 5.99;
    private final int FIL = 6;
    private final int COL = 10;

    public Sala() {
        this(0,"","");
    }
    public Sala(int numSala, String pelicula, String horaProyeccion) {

        this.numSala = numSala;
        this.pelicula = pelicula;
        this.horaProyeccion = horaProyeccion;
        this.asientos = new char[FIL][COL];
        this.recaudacionSala = 0.0;

        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) { this.asientos[i][j] = '.'; }
        }
    }

    public void mostrarSala() {
        System.out.printf("  ");
        for (int i = 0; i < COL; i++) {
            System.out.printf("%2d", i);
        }
        System.out.println();
        for (int i = 0; i < FIL; i++) {
            System.out.printf("%2d", i);
            for (int j = 0; j < COL; j++) {
                System.out.printf("%2c", this.asientos[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean asientoDisponible(int fila, int columna) {
        if(fila < 0 || fila >= FIL) { return false; }
        if(columna < 0 || columna >= COL) { return false; }
        return this.asientos[fila][columna] == '.';
    }

    public void venderEntrada(int fila, int columna) {
        if (this.asientoDisponible(fila, columna)) {
            this.asientos[fila][columna] = 'X';
            this.recaudacionSala += this.PRECIO_ENTRADA;
            Sala.recaudacionTotal += this.PRECIO_ENTRADA;
            System.out.println("[OK] Entrada vendida ( Precio:" + this.PRECIO_ENTRADA + "€)");
        } else {
            System.out.println("[ASIENTO NO DISPONIBLE]");
        }
    }
    public double getRecaudacionSala() {return recaudacionSala;}

    public int getAsientosDisponibles() {
        int disponibles = FIL * COL;
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (this.asientos[i][j] != '.') { disponibles--;}
            }
        }
        return disponibles;
    }

    public String toString() {
        return "[Sala " + this.numSala + "] - " + this.pelicula + " (" + this.horaProyeccion
                + ") - Asientos libres: " + this.getAsientosDisponibles();
    }

    public static double getRecaudacionTotal() {return recaudacionTotal;}
}
