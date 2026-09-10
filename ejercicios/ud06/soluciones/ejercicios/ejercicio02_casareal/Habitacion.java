package ejercicio02_casareal;

public class Habitacion {
    private String nombre;
    private double metrosCuadrados;

    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    @Override
    public String toString() {
        return nombre + " (" + metrosCuadrados + " m²)";
    }
}
