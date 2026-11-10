package ejercicio03_electrodomesticos;

public class Main {
    public static void main(String[] args) {
        Lavadora l = new Lavadora(350, 60, "Blanco", 8);
        Television t = new Television(800, 15, "Negro", 55);

        l.consumirEnergia();
        t.consumirEnergia();
    }
}
