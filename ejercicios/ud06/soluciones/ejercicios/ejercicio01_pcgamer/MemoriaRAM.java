package ejercicio01_pcgamer;

public class MemoriaRAM {
    private String capacidad;
    private double precio;

    public MemoriaRAM(String capacidad, double precio) {
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "RAM: " + capacidad + " (" + precio + "€)";
    }
}
