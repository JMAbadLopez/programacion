package polimorfismo;

public class Guerrero extends Personaje {
    private int furia;

    public Guerrero(String nombre, int vida, int nivel, int furia) {
        super(nombre, vida, nivel);
        this.furia = furia;
    }

    @Override
    public void atacar(Personaje objetivo) {
        int dano = this.nivel * 2 + this.furia;
        System.out.println(this.nombre + " lanza un ESPADAZO BRUTAL a " + objetivo.getNombre());
        objetivo.recibirDano(dano);
    }

    public void gritoDeGuerra() {
        System.out.println(this.nombre + ": ¡¡GRRRR!!");
    }
}
