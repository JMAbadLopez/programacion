package model;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int vida, int nivel, int agilidad, int resistencia, int mana) {
        super(nombre, vida, nivel, agilidad, resistencia);
        this.mana = mana;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (mana < 10) {
            System.out.println(nombre + " no tiene suficiente maná... Recuperando 5.");
            mana += 5;
            return;
        }

        int danoBase = nivel * nivel + mana + getBonusAtaque();
        mana -= 10;
        System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre());
        objetivo.recibirDano(danoBase);
    }

    @Override
    public String toString() {
        return super.toString() + " | Maná: " + mana;
    }
}
