package model;

public class Orco extends Personaje {
    private int rabia;

    public Orco(String nombre, int vida, int nivel, int agilidad, int resistencia, int rabia) {
        super(nombre, vida, nivel, agilidad, resistencia);
        this.rabia = rabia;
    }

    @Override
    public void atacar(Personaje objetivo) {

        int danoPuro = nivel * 3 + rabia + getBonusAtaque();
        System.out.println(nombre + " lanza un ataque brutal que ignora defensas a " + objetivo.getNombre());

        objetivo.recibirDano(danoPuro + objetivo.resistencia + objetivo.getBonusDefensa());
    }

    @Override
    public String toString() {
        return super.toString() + " | Rabia: " + rabia;
    }
}
