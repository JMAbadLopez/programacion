package ejercicio03_electrodomesticos;

public class Television extends Electrodomestico {
    private int resolucion;

    public Television(double precio, double peso, String color, int resolucion) {
        super(precio, peso, color);
        this.resolucion = resolucion;
    }

    @Override
    public void consumirEnergia() {
        System.out.println("Televisión de " + resolucion + " pulgadas encendida consumiendo energía.");
    }
}
