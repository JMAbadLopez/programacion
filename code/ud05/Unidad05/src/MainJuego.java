public class MainJuego {

    public static void main(String[] args) {

        Personaje heroe, villano, villano2;

        heroe = new Personaje("Aragorn", 150, 1);
        villano = new Personaje("Orco");
        villano2 = new Personaje(villano);


        heroe.saludar();
        villano.saludar();
        villano2.saludar();

        villano.recibirDano(47);
        heroe.recibirDano(32);

        heroe.saludar();
        villano.saludar();

        villano.recibirDano(10);

        heroe.saludar();
        villano.saludar();

        System.out.println("Total personajes : " + Personaje.getTotalPersonajes());
        Personaje p4;
        p4 = new Personaje(villano);
        System.out.println("Total personajes : " + Personaje.getTotalPersonajes());
    }
}
