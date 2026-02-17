package polimorfismo;

public class Mago extends Personaje {

    private int mana;

    public Mago(String nombre, int vida, int nivel, int mana) {
        super(nombre, vida, nivel);
        this.mana = mana;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (this.mana >= 10) {
            int dano = this.nivel * 3; // El mago pega más fuerte
            this.mana -= 10;
            System.out.println(this.nombre + " lanza BOLA DE FUEGO a " + objetivo.getNombre());
            objetivo.recibirDano(dano);
        } else {
            System.out.println(this.nombre + " no tiene maná y golpea con el bastón (puf...)");
            objetivo.recibirDano(1);
        }
    }
}