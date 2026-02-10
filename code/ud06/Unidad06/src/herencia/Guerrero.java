package herencia;

public class Guerrero extends Personaje {
    private int furia;

    public Guerrero(String nombre, int vida, int furia) {
        super(nombre, vida);
        this.furia = furia;
    }

    @Override
    public void saludar() {
        System.out.println("¡GRRR! SOY " + this.nombre + " Y TE APLASTARÉ.");
    }
}