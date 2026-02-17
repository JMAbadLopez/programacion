package herencia;

public class Mago extends Personaje {

    private int mana;

    public Mago(String nombre, int vida, int mana) {
        super(nombre, vida);
        this.mana = mana;
    }

    @Override
    public void saludar() {
        System.out.println("");
    }
}
