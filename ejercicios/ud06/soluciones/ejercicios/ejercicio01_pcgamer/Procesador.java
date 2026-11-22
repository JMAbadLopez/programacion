package ejercicio01_pcgamer;

public class Procesador {
    private String modelo;
    private double precio;

    public Procesador(String modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Procesador: " + modelo + " (" + precio + "€)";
    }
}
