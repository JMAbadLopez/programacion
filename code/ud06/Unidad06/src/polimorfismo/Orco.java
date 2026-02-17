package polimorfismo;

public class Orco extends Personaje {

    private int rabia;

    public Orco(String nombre, int vida, int nivel, int rabia) {
        super(nombre, vida, nivel);
        this.rabia = rabia;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (this.vida < 10) {
            int dano = this.nivel * 4 + rabia;
            System.out.println(this.nombre + " ataca con FURIA " + objetivo.getNombre());
            objetivo.recibirDano(dano);
        } else {
            objetivo.recibirDano(this.nivel);
        }
    }
}
