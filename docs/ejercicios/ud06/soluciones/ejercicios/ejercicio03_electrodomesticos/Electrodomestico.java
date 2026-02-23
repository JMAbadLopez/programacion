package ejercicio03_electrodomesticos;

public class Electrodomestico {
    protected double precio;
    protected double peso;
    protected String color;

    public Electrodomestico(double precio, double peso, String color) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
    }

    public void consumirEnergia() {
        System.out.println("Electrodoméstico consumiendo...");
    }

    // Getters
    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }
}
