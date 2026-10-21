package ejercicio01_pcgamer;

public class TarjetaGrafica {
    private String modelo;
    private double precio;

    public TarjetaGrafica(String modelo, double precio) {
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
        return "Gráfica: " + modelo + " (" + precio + "€)";
    }
}
