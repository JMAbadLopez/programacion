package ejercicio03_electrodomesticos;

public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora(double precio, double peso, String color, double carga) {
        super(precio, peso, color);
        this.carga = carga;
    }

    @Override
    public void consumirEnergia() {
        System.out.println("Lavadora de " + carga + "kg lavando y consumiendo mucha energía.");
    }
}
