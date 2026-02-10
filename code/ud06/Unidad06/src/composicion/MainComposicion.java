package composicion;

public class MainComposicion {

    public static void main(String[] args) {

        Personaje guerrero;

        Arma hacha = new Arma("Cariñitos", 10);
        Arma lanza = new Arma("Lanza matazombies", 13);
        Item agua = new Item("Agua", 100);

        guerrero = new Personaje("Conan", hacha);

        guerrero.cogerObjeto(agua);
        guerrero.atacar();

        guerrero.cambiarArma(lanza);
        guerrero.atacar();

        guerrero.verMochila();

    }
}
