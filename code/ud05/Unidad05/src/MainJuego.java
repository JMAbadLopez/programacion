public class MainJuego {

    public static void main(String[] args) {

        Personaje heroe, villano;

        heroe = new Personaje();
        villano = new Personaje();

        heroe.setNombre("Aragorn");
        heroe.setVida(100);
        heroe.setNivel(1);

        villano.setNombre("Orco");
        villano.setVida(50);
        villano.setNivel(1);

        heroe.saludar();
        villano.saludar();

        villano.recibirDano(47);
        heroe.recibirDano(32);

        heroe.saludar();
        villano.saludar();

        villano.recibirDano(10);

        heroe.saludar();
        villano.saludar();

    }
}
