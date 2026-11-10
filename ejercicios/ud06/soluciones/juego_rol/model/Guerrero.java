package model;

public class Guerrero extends Personaje {
    private int furia;

    public Guerrero(String nombre, int vida, int nivel, int agilidad, int resistencia, int furia) {
        super(nombre, vida, nivel, agilidad, resistencia);
        this.furia = furia;
    }

    @Override
    public void atacar(Personaje objetivo) {
        int danoBase = nivel * 2 + furia + getBonusAtaque();
        if (vida < 10) {
            System.out.println(nombre + " entra en estado BERSERKER!");
            danoBase *= 2;
        }
        System.out.println(nombre + " ataca con espada a " + objetivo.getNombre());
        objetivo.recibirDano(danoBase);
    }

    @Override
    public String toString() {
        return super.toString() + " | Furia: " + furia;
    }
}
