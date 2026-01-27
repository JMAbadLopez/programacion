package alucine;

public class Sala {

    private char[][] asientos;
    private int numSala;
    private String pelicula;
    private String horaProyeccion;
    private double recaudacionSala;

    public static double recaudacionTotal = 0.0;
    public final double precioEntrada = 5.99;

    public Sala(int numSala, String pelicula, String horaProyeccion) {
        this.numSala = numSala;
        this.pelicula = pelicula;
        this.horaProyeccion = horaProyeccion;
        this.asientos = new char[6][10];
        this.recaudacionSala = 0.0;
    }

    public void mostrarSala() {}
    public void venderEntrada(int fila, int columna) {}
    public boolean asientoDisponible(int fila, int columna) {}


}
